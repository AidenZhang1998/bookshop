/**
 * 校外客户信息列表
 */

// 设置全局表单提交格式
Vue.http.options.emulateJSON = true;

// Vue实例
var vm = new Vue({
    el: '#app',
    data() {
        return {
            // element-ui的table需要的参数必须是Array类型的
            users: [{
                id: '',
                name: '',
                username: '',
                sex: '',
                address: '',
                email: ''
            }],

            // 编辑表
            editor: {
            	name: '',
            	username: '',
            	sex: '',
            	address: '',
            	email: ''
            },
    
            // 添加dialog
            showSave: false,
            // 编辑dialog
            showEditor: false,

            // 条件查询单独封装的对象
            searchEntity: {},



            // 分页选项
            pageConf: {
                // 设置一些初始值(会被覆盖)
                pageCode: 1, // 当前页
                pageSize: 6, // 每页显示的记录数
                totalPage: 12, // 总记录数
                pageOption: [6, 10, 20], // 分页选项
            },

            loading: {},


            activeIndex: '3', // 默认激活
        }
    },
    methods: {
        /**
		 * loading加载动画
		 */
        loadings() {
            this.loading = this.$loading({
                lock: true,
                text: '拼命加载中',
                spinner: 'el-icon-loading',
            });
            setTimeout(() => {
                this.loading.close();
            }, 2000);
        },

        /**
		 * Public method
		 */
        // 刷新列表
        reloadList() {
            console.log("totalPage:" + this.pageConf.totalPage + ",pageSize:" + this.pageConf.pageSize + ",:pageCode:" + this.pageConf.pageCode);
            this.search(this.pageConf.pageCode, this.pageConf.pageSize);
        },
        // 条件查询
        search(pageCode, pageSize) {
            this.loadings();
            this.$http.post('/users/findByConPage?pageSize=' + pageSize + '&pageCode=' + pageCode, this.searchEntity).then(result => {
                console.log(result);
                this.users = result.body.rows;
                this.pageConf.totalPage = result.body.total;
                this.loading.close(); // 数据更新成功就手动关闭动画
            });

        },
        // checkbox复选框
        selectChange(val) {
            this.count = val.length;
            this.multipleSelection = val;
        },
        // 清空已选择的
        clearSelect() {
            this.$refs.goods.clearSelection();
        },
        // pageSize改变时触发的函数
        handleSizeChange(val) {
            this.search(this.pageConf.pageCode, val);
        },
        // 当前页改变时触发的函数
        handleCurrentChange(val) {
            this.pageConf.pageCode = val; // 为了保证刷新列表后页面还是在当前页，而不是跳转到第一页
            this.search(val, this.pageConf.pageSize);
        },
       
        // 点击列表中已上传的文件事的钩子函数
        handlePreview(file) {
            // this.dialogImageUrl = file.url;
            // this.dialogVisible = true;

        },
        // 上传的文件个数超出设定时触发的函数
        onExceed(files, fileList) {
            this.$message({
                type: 'info',
                message: '最多只能上传一个图片',
                duration: 6000
            });
        },
       
    },

    // 生命周期函数
    created() {
        // this.findAll();
        this.search(this.pageConf.pageCode, this.pageConf.pageSize);
        this.loadings(); // 加载动画
    },

});

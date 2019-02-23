package zut.cs.network.bookshop.service.impl;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import zut.cs.network.bookshop.dao.GoodsDao;
import zut.cs.network.bookshop.entity.Goods;
import zut.cs.network.bookshop.entity.PageBean;
import zut.cs.network.bookshop.service.GoodsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *商品业务的操作实现
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    @Override
    public List<Goods> findAll() {
        return null;
    }

    @Override
    public List<Goods> findById(Long id) {
        return goodsDao.findById(id);
    }

    @Override
    public void create(Goods goods) {
        goodsDao.create(goods);
    }

    @Override
    public void update(Goods goods) {
        goodsDao.update(goods);
    }

    @Override
    public void delete(Long... ids) {
        for (Long id : ids) {
            goodsDao.delete(id);
        }
    }

    /**
     * 分页查询-条件查询方法
     *
     * @param goods    查询条件
     * @param pageCode 当前页
     * @param pageSize 每页的记录数
     * @return
     */
    public PageBean findByPage(Goods goods, int pageCode, int pageSize) {
        //使用Mybatis分页插件
        PageHelper.startPage(pageCode, pageSize);

        //调用分页查询方法，其实就是查询所有数据，mybatis自动帮我们进行分页计算
        Page<Goods> page = goodsDao.findByPage(goods);

        return new PageBean(page.getTotal(), page.getResult());
    }
}

package zut.cs.network.bookshop.service;




import zut.cs.network.bookshop.entity.Message;
import zut.cs.network.bookshop.entity.PageBean;



/**
 * 用户的业务逻辑操作
 *
 */
public interface MessageService extends BaseService<Message>{

	 /**
     * 分页查询
     */
    PageBean findByPage(Message message, int pageCode, int pageSize);
	
}

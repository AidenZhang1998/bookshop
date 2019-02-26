package zut.cs.network.bookshop.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import zut.cs.network.bookshop.dao.MessageDao;
import zut.cs.network.bookshop.entity.Message;
import zut.cs.network.bookshop.entity.PageBean;
import zut.cs.network.bookshop.service.MessageService;


/**
 * 用户的业务操作实现
 *
 */
@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageDao messageDao;

	@Override
	public List<Message> findAll() {
		// TODO Auto-generated method stub
		return messageDao.AllUser();
	}

	@Override
	public PageBean findByPage(Message message, int pageCode, int pageSize) {
		// TODO Auto-generated method stub
		 PageHelper.startPage(pageCode, pageSize);

	        //调用分页查询方法，其实就是查询所有数据，mybatis自动帮我们进行分页计算
	        Page<Message> page = messageDao.findByPage(message);

	        return new PageBean(page.getTotal(), page.getResult());
	}
	@Override
	public void delete(Long... ids) {
		// TODO Auto-generated method stub
		 for (Long id : ids) {
			 messageDao.DeleteUser(id);
	        }
		
	}
	@Override
	public List<Message> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(Message t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Message t) {
		// TODO Auto-generated method stub
		
	}
	
}

package zut.cs.network.bookshop.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zut.cs.network.bookshop.dao.MessageDao;
import zut.cs.network.bookshop.entity.Message;
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
	public Message FindByName(String name) {
		// TODO Auto-generated method stub
		return messageDao.FindByName(name);
	}


	@Override
	public List<Message> AllUser() {
		// TODO Auto-generated method stub
		return messageDao.AllUser();
	}


	@Override
	public void DeleteUser(int id) {
		// TODO Auto-generated method stub
		messageDao.DeleteUser(id);
	}
	
}

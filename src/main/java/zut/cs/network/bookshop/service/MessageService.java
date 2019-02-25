package zut.cs.network.bookshop.service;


import java.util.List;

import zut.cs.network.bookshop.entity.Message;



/**
 * 用户的业务逻辑操作
 *
 */
public interface MessageService {

	Message FindByName(String name);
	List<Message> AllUser();
	void DeleteUser(int id);
	
}

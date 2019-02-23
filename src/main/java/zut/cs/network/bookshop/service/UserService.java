package zut.cs.network.bookshop.service;


import zut.cs.network.bookshop.entity.User;



/**
 * 用户的业务逻辑操作
 *
 */
public interface UserService {

	User FindByName(String name);
}

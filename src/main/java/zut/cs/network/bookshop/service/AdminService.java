package zut.cs.network.bookshop.service;

import zut.cs.network.bookshop.entity.Admin;


/**
 * 管理员的业务逻辑操作
 *
 */
public interface AdminService {
	Admin FindByName(String name);
}

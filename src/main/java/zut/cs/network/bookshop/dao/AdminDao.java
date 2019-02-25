package zut.cs.network.bookshop.dao;

import org.apache.ibatis.annotations.Mapper;

import zut.cs.network.bookshop.entity.Admin;


/**
 * 管理员相关的操作
 *
 */
@Mapper
public interface AdminDao {
	Admin FindByName(String name);
}

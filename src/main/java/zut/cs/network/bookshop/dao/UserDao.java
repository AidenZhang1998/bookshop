package zut.cs.network.bookshop.dao;

import java.util.List;




import org.apache.ibatis.annotations.Mapper;

import zut.cs.network.bookshop.entity.User;

/**
 * 对用户的操作
 *
 */
@Mapper
public interface UserDao {
	List<User> AllUser();
	void DeleteUser(int id);
	User FindByName(String name);
	void AddUser(User user);

}

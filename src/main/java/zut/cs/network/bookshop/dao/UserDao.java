package zut.cs.network.bookshop.dao;

import java.util.List;



import org.apache.ibatis.annotations.Mapper;

import zut.cs.network.bookshop.entity.User;
@Mapper
public interface UserDao {
	// 添加用户
	void AddUser(User user);

	/*// 根据激活码查找用户
	public User findUserByActiveCode(String activeCode);

	// 激活用戶
	public void activeUser(String activeCode);

	// 根据用户名与密码查找用户
	public User findUserByUsernameAndPassword(String username, String password);*/
	//列出所有用户
	List<User> AllUser();
	void DeleteUser(int id);
	User FindByName(String name);
}

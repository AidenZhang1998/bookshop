package zut.cs.network.bookshop.dao;



import java.util.List;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;


import zut.cs.network.bookshop.entity.User;
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

	
    @Autowired
    UserDao userDao;
	@Test
	public void testAddUser() {
		User user=new User();
		user.setUsername("test");
		user.setEmail("184@qq.com");
		user.setIntroduce("学生");
		user.setActiveCode("1234");
		user.setGender("男");
		user.setPassword("test");
		user.setTelephone("123456789");
		System.out.println(user.toString());
		userDao.AddUser(user);
	}
	@Test
	public void testAllUser() {
		List<User> users;	
		users=userDao.AllUser();
		for(int i=0;i<users.size();i++)
		{
		System.out.println(users.get(i).toString());
		}
	}
	@Test
    public void testDeleteUser() {
		userDao.DeleteUser(1);
		System.out.println(userDao.FindByName("test").toString());
	}
}

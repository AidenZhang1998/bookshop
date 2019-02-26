package zut.cs.network.bookshop.dao;



import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import zut.cs.network.bookshop.entity.Message;
@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageDaoTest {
	@Autowired
    MessageDao messageDao;
	@Test
	public void testAllUser() {
		List<Message> users;	
		users=messageDao.AllUser();
		for(int i=0;i<users.size();i++)
		{
		System.out.println(users.get(i).toString());
		}
	}

	@Test
	public void testDeleteUser() {
		
	}

	@Test
	public void testFindByPage() {
		
	}

}

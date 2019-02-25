package zut.cs.network.bookshop.dao;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import zut.cs.network.bookshop.entity.Admin;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminDaoTest {

	@Autowired
	 AdminDao adminDao;

	@Test
	public void testFindByName() {
		Admin admin=new Admin();
		admin=adminDao.FindByName("test");
	}

}

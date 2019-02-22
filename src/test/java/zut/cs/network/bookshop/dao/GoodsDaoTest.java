package zut.cs.network.bookshop.dao;



import java.util.List;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import zut.cs.network.bookshop.entity.Goods;
@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodsDaoTest {

@Autowired
private GoodsDao goodsDao;
	@Test
	public void testFindAll() {
		List<Goods> goodslist;	
		goodslist=goodsDao.findAll();
		for(int i=0;i<goodslist.size();i++)
		{
		System.out.println(goodslist.get(i).toString());
		}
	}

	@Test
	public void testFindByPage() {
		
	}

	@Test
	public void testFindById() {
		
	}

	@Test
	public void testCreate() {
		
	}

	@Test
	public void testUpdate() {
		
	}

	@Test
	public void testDelete() {
		
	}

}

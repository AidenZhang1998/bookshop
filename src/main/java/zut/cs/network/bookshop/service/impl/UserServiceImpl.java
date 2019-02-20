package zut.cs.network.bookshop.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zut.cs.network.bookshop.dao.UserDao;
import zut.cs.network.bookshop.entity.User;
import zut.cs.network.bookshop.service.UserService;



@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


	@Override
	public User FindByName(String name) {
		// TODO Auto-generated method stub
		return userDao.FindByName(name);
	}
}

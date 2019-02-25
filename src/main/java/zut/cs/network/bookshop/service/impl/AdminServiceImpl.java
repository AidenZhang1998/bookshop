package zut.cs.network.bookshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zut.cs.network.bookshop.dao.AdminDao;
import zut.cs.network.bookshop.entity.Admin;

import zut.cs.network.bookshop.service.AdminService;
@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminDao adminDao;
	@Override
	public Admin FindByName(String name) {
		// TODO Auto-generated method stub
		return adminDao.FindByName(name);
	}

}

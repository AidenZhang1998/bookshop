package zut.cs.network.bookshop.service;


import zut.cs.network.bookshop.entity.User;



public interface UserService {

	User FindByName(String name);
}

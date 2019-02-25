package zut.cs.network.bookshop.entity;

import java.io.Serializable;
/**
 * 管理员表
 */
public class Admin implements Serializable{


	private static final long serialVersionUID = 1L;
	private String username;//用户名
    private String password;//密码
	public String getName() {
		return username;
	}
	public void setName(String name) {
		this.username = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    
}

package zut.cs.network.bookshop.entity;

import java.io.Serializable;
/**
 * 普通用户信息表
 */
public class Message implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private int id; // 用户编号
	private String username; // 用户姓名
	private String name;//昵称
	private String address; // 用户住址
	private String sex; // 用户性别
	private String email; // 用户邮箱
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSex() {
		return sex;
	}
	public void setGender(String gender) {
		this.sex = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", name=" + name + ", address=" + address + ", sex="
				+ sex + ", email=" + email + "]";
	}
	
}

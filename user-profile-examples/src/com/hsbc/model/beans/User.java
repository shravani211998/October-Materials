package com.hsbc.model.beans;

public class User {
	private int userId;
	private String name;
	private String password;
	private long phone;
	// later we will add address
	
	public int getUserId() {
		return userId;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userId, String name, String password, long phone) {
		super();
		this.userId = userId;
		this.name = name;
		this.password = password;
		this.phone = phone;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
}

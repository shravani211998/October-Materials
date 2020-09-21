package com.hsbc.examples;

public class User {
	private String name;
	private String password;
	private String gender;
	
	public User(String name, String password, String gender) {
		super();
		this.name = name;
		this.password = password;
		this.gender = gender;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", gender=" + gender + "]";
	}
}

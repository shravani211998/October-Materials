package com.hsbc.model.dao;

import com.hsbc.model.beans.User;

public class ArrayBackedUserDao implements UserDao {

	// temporary database
	private static User[] userArray = new User[10];
	private static int index = 0;
	@Override
	public User store(User user) {
		userArray[index] = user;
		return userArray[index++];
	}

}

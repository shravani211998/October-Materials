package com.hsbc.model.business;

import com.hsbc.model.beans.User;
import com.hsbc.model.dao.UserDao;
import com.hsbc.model.utility.UserFactory;

public class UserServiceImpl implements UserService {

	@Override
	public User storeUser(User user) {
		// this is the way you get different instance
		UserDao dao = (UserDao)UserFactory.getInstance("dao");
		User createdUser =  dao.store(user);
		return createdUser;
	}

}

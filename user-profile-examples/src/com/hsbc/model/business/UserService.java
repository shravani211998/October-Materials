package com.hsbc.model.business;

import com.hsbc.model.beans.User;
// UserService will access methods present in UserDAO
public interface UserService {
	public User storeUser(User user);
}

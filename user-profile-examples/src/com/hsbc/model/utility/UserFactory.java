package com.hsbc.model.utility;

import com.hsbc.model.business.UserService;
import com.hsbc.model.business.UserServiceImpl;
import com.hsbc.model.dao.ArrayBackedUserDao;
import com.hsbc.model.dao.UserDao;

public class UserFactory {
	// it can return dao, service or controller instance
	public static UserDao getDaoInstance() {
		UserDao dao = new ArrayBackedUserDao();
		return dao;
	}
	
	public static UserService getServiceInstance() {
		return new UserServiceImpl();
	}
	
	
	public static Object getInstance(String type) {
		Object obj = null;
		switch(type) {
		case "dao" : 
			obj = new ArrayBackedUserDao();
			break;
		case "service" :
			obj = new UserServiceImpl();
			break;
		}
		return obj;
	}
}

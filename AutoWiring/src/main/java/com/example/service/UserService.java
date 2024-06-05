package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.repository.UserDao;

@Service
public class UserService {

	/*
	 * @Autowired
	 * 
	 * @Qualifier("oracle") //field Injection
	 */
	// @Autowired
	private UserDao userDao;

	@Autowired

	@Qualifier("mysql")
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	// Setter Injection

	public void getServiceMethod() {
		userDao.getData();
	}
}

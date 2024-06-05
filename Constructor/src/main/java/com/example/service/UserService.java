package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.repository.UserDao;

@Service
public class UserService {
	private UserDao userDao;

	@Autowired

	public UserService(UserDao userDao) {

		this.userDao = userDao;
	}

	public void getServiceMethod() {
		userDao.getData();
	}
}

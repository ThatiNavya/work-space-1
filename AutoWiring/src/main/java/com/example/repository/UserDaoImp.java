package com.example.repository;
import org.springframework.stereotype.Repository;

@Repository("user")
public class UserDaoImp implements UserDao {

	public void getData() {
		System.out.println("Getting Data");
	}

}

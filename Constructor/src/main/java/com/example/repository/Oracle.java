package com.example.repository;

import org.springframework.stereotype.Repository;

@Repository("oracle")
public class Oracle implements UserDao {

	public void getData() {
		System.out.println("Getting data from Oracle db");
	}
}

package com.example.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("mysql")

public class Mysql implements UserDao{

	@Override
	public void getData() {
		System.out.println("Getting Data from Mysql db");
	}

}

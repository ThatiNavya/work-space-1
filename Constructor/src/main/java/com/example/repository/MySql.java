package com.example.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("mysql")

public class MySql implements UserDao {

	@Override
	public void getData() {
		System.out.println("Getting data from MySql db");
		
	}
    
}

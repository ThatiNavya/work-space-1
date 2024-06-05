package com.example.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("oracle")
@Primary
public class Oracle implements UserDao{

	@Override
	public void getData() {
		System.out.println("Getting Data from Oracle db");
		
	}

}

package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.service.UserService;

@SpringBootApplication
public class AutoWiringApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext context = SpringApplication.run(AutoWiringApplication.class, args);
		UserService u =context.getBean(UserService.class);
		u.getServiceMethod();
		
	
	}

}

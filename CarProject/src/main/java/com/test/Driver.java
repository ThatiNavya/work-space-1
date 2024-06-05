package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.autowiring.Car;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springbean.xml");
		Car c1 = context.getBean("car", Car.class);

		c1.drive();

	}

}

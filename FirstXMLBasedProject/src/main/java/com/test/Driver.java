package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.scope.Car;

public class Driver {
   public static void main(String[] args) {
	 ApplicationContext context=new ClassPathXmlApplicationContext("spring-bean.xml");
	 Car c1 = context.getBean("car",Car.class);
	 System.out.println(c1.hashCode());

	 
	 Car c2 = context.getBean("car",Car.class);
	 System.out.println(c2.hashCode());
   
   }
}

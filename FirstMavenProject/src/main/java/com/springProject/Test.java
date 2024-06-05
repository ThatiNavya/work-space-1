package com.springProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("springbean.xml");
		BillCollector bean = context.getBean("bc",BillCollector.class);
		bean.billPay(1500.00);
	}
}

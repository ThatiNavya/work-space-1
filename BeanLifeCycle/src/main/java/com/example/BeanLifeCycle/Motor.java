package com.example.BeanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
@Component
public class Motor implements InitializingBean,DisposableBean{

	 public Motor() {
		 System.out.println("Motor Class ::Constructor ");
	 }

	

	@Override
	public void afterPropertiesSet() throws Exception {
         System.out.println("After Motor Class Created");		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Motor Class Stopped");
		
		
	}
	 
	
}

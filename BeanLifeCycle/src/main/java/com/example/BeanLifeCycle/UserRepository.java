package com.example.BeanLifeCycle;

import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class UserRepository {
   public UserRepository() {
	   System.out.println("UserRepository Consrtictor started");
   }
   @PreDestroy
   public void preDestroy() {
	   System.out.println("DB Connection Closed");
   }
}

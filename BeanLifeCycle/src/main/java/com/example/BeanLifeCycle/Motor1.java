package com.example.BeanLifeCycle;

import org.springframework.beans.factory.annotation.Autowired;

public class Motor1 {
  public Motor1() {
	  System.out.println("Motor-1 Constructor called");
  }
  @Autowired
  private UserRepository userRepository;
 private void postConstruct() {
 }

}

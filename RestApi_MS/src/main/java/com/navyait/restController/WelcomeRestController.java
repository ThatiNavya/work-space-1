package com.navyait.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

      @GetMapping("/welcome")
	  public String getWelcome() {
		return "Welocome To Microservices";
		  
	  }
	
	
	
}

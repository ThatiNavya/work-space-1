package com.example.restController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreatRestController {
	Logger logger =LoggerFactory.getLogger(GreatRestController.class);
 @GetMapping("/greet")
  public String getGreetMsg() {
	 logger.info("greetMethod Execution Started");
	  String msg ="Good Morning";
	  logger.info("greetMethod Execution Ended");
	return msg;
  }
}

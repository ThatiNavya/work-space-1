package com.example.restController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestContoller1 {
	Logger logger = LoggerFactory.getLogger(WelcomeRestContoller1.class);

	@GetMapping("/welcome1")
	public String getWelcomeMsg1() {
		logger.info("getWelcomeMethod execution Started");
		String msg = "WELCOME TO JRTP";
		/*
		 * try { int i =10/0; }catch(Exception e) {
		 * logger.error("Exception Occured"+e.getMessage()); }
		 */
		int i =10/0;
		logger.info("getWelcomeMethod execution Ended");
		return msg;

	}
}

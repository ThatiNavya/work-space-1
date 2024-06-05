package com.navyait.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeRestController {

	@GetMapping("/welcome")
	public   ModelAndView  getWelcomeMsg() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("msg", "welcome to JRTP");
		mav.setViewName("index");
		return mav;
		
	}
	@GetMapping("/greet")
	public   ModelAndView  getGreetMsg() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("msg1", "welcome to WEB MVC");
		mav.setViewName("index1");
		return mav;
		
	}
	
	
}

package com.navyait.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeRestController {

	@GetMapping("/welcome")
	 public ModelAndView getWelcomeMsg(){
		 
		 ModelAndView mav = new ModelAndView();
		 mav.addObject("msg", "Welcome to SBMS");
		 mav.setViewName("welcome"); // presentation page as a response
		 return mav;
	 
	 }
}

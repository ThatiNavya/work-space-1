package com.navyait.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetRestController {

	@GetMapping("/greet")
	 public String getGreetMsg(Model model) {
		 
		 String msgTxt ="Good Morning...!";
		 
		 model.addAttribute("greetmsg", msgTxt);
		 return "greetmsg";
	 }
}

package com.navyait.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryParamExamp {

	@GetMapping("/course")
	public String getExample(@RequestParam String cname, @RequestParam String tname) {
		String resPayload = cname + " " + "By" +" "+ tname + " " + "Fee is 15000";
		return resPayload;
	}
}

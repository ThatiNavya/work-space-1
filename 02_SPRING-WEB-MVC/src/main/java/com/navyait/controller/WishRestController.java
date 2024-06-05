package com.navyait.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WishRestController {
   @GetMapping("/wish")

	public String getWishMsg() {

		String msg = "All the Best...!";
		return msg;

	}
}

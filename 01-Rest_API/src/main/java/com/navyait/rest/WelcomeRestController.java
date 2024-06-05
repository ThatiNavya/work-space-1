package com.navyait.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @Controller and @ResponseBody.
public class WelcomeRestController {

	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMsg() {

		String resPayload = "WELCOME TO SBMS";

		String successMsg = "Saved Successfully";
		String failMsg = "Unable To save the data";
		if (resPayload != null) {
			return new ResponseEntity<>(successMsg, HttpStatus.OK);

		} else {
			return new ResponseEntity<>(resPayload, HttpStatus.BAD_REQUEST);

		}

	}

	@GetMapping("/greet")
	public String getGreetMsg() {

		String resPayload = "Good Morining";
		return resPayload;

	}
}

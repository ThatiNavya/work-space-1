package com.navyait.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRestController {
	@GetMapping("/book/{name}")
	public ResponseEntity<String> getBookPrice(@PathVariable String name) {

		String resBody = name + " " + "Price is $400";

		return new ResponseEntity<>(resBody, HttpStatus.OK);

	}

	@GetMapping("/book/{bname}/{aname}")
	public ResponseEntity<String> getBook(@PathVariable String bname, @PathVariable String aname) {

		String resBody = bname + " " + "By" + " " + aname + " " + "is out of stock";

		return new ResponseEntity<>(resBody, HttpStatus.OK);

	}
}

package com.navyait.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.navyait.binding.Product;

@RestController
public class ProductRestController {

	@GetMapping(value = "/product", produces = { "application/xml", "application/json" })
	public ResponseEntity<Product> getProduct() {

		Product product = new Product();
		product.setId(102);
		product.setName("LAPTOP");
		product.setPrice(65000.00);
		return new ResponseEntity<Product>(product, HttpStatus.OK);

	}
}

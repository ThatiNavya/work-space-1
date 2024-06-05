package com.shiva.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shiva.entity.Product;
import com.shiva.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping("/add")
	public ResponseEntity<Product> addProduct(@RequestBody Product product){
		Product addedProduct = service.addProduct(product);
		
		return new ResponseEntity<>(addedProduct, HttpStatus.CREATED);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Product> addProduct(@PathVariable Integer id){
		Product product = service.getProductById(id);
		
		return new ResponseEntity<>(product, HttpStatus.OK);
	}
	
	
	

}

package com.navyait.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.navyait.bindings.Product;

@Controller
public class ProductRestController {
	@GetMapping("/")
	public String getProductForm(Model model) {

		Product productObj = new Product();

		model.addAttribute("product", productObj);

		return "index";

	}
	@PostMapping("/product")
	public String handleFormSubmission(Product product, Model model) {

		System.out.println(product);
		model.addAttribute("msg", "Product saved Sucessfully");
		return "sucess";
		
	}

}

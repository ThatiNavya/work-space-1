package com.navyait.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.navyait.binding.Book;

@Controller
public class BookRestController {
    @GetMapping("/book")
	public String getBookData(Model model) {

		Book bookObj = new Book(101, "Spring", 1500.00);
		model.addAttribute("book", bookObj);

		return "book";

	}
}

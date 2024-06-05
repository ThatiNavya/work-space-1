package com.navyait.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.navyait.binding.Book;
@Controller
public class BooksRestController {

	@GetMapping("/books")
	public ModelAndView getBooksData() {
		ModelAndView mav = new ModelAndView();

		Book b1 = new Book(101, "Spring", 1500.00);
		Book b2 = new Book(102, "Java", 1600.00);
		Book b3 = new Book(103, "React", 1700.00);
		Book b4 = new Book(104, "AWS", 1800.00);
		
		List<Book> booksList = Arrays.asList(b1, b2, b3, b4);
		
		mav.addObject("booksMsg", booksList);
		mav.setViewName("booksView");

		return mav;
	}
}

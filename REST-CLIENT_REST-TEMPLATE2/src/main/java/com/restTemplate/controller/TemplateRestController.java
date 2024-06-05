package com.restTemplate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restTemplate.binding.Book;
import com.restTemplate.service.TemplateService2;

@RestController
public class TemplateRestController {

	@Autowired
	private TemplateService2 templateService2;

	@PostMapping("/add")
	public String addBook(@RequestBody Book book) {
		return templateService2.addBook(book);
	}

	@GetMapping("/get")
	public String getBooks() {
		return templateService2.getBooks();
	}

	@GetMapping("/getById/{bookId}")
	public String getBookById(@PathVariable Integer bookId) {
		return templateService2.getBookById(bookId);

	}

	@PutMapping("/updateById/{bookId}")
	public String updateBookById(@PathVariable Integer bookId, @RequestBody Book updateBook) {
		return templateService2.updateBookById(bookId, updateBook);

	}
	@DeleteMapping("/deleteBookById/{bookId}")
	public String deleteBook(@PathVariable Integer bookId) {
		return templateService2.deleteBook(bookId);
	}

}
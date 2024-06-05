package com.navyait.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.navyait.binding.Book;
import com.navyait.entity.BookEntity;
import com.navyait.service.BookService;

@RestController
public class BookRestController {

	@Autowired
	private BookService bookService;

	@PostMapping("/addBook")
	public ResponseEntity<String> addBook(@RequestBody Book book) {
		boolean addBook = bookService.addBook(book);
		if (addBook) {

			return new ResponseEntity<String>("Book saved Sucessfully", HttpStatus.CREATED);
		}
		return new ResponseEntity<String>("Book Failed to save", HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@GetMapping("/getBooks")
	public ResponseEntity<List<BookEntity>> getBooks() {
		List<BookEntity> books = bookService.getBooks();

		return new ResponseEntity<List<BookEntity>>(books, HttpStatus.OK);
	}

	@PutMapping("/updateBook/{bookId}/{price}")
	public ResponseEntity<String> updateBook(@PathVariable Integer bookId,@PathVariable Double price) {

		boolean updateBook = bookService.updateBook(bookId, price);

		if (updateBook) {
			return new ResponseEntity<String>("Book Updated Sucessfully", HttpStatus.OK);
		}

		return new ResponseEntity<String>(" Failed to Updated Book ", HttpStatus.BAD_REQUEST);
	}
    @DeleteMapping("/deleteBook/{bookId}")
	public ResponseEntity<String> deleteBook(@PathVariable Integer bookId) {
		boolean deleteBook = bookService.deleteBook(bookId);
		if (deleteBook) {
			return new ResponseEntity<String>("Book Deleted Sucessfully", HttpStatus.OK);
		}
		return new ResponseEntity<String>("We are unable to find the record", HttpStatus.BAD_REQUEST);

	}
}

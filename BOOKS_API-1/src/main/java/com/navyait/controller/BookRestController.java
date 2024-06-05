package com.navyait.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

	Logger logger = LoggerFactory.getLogger(BookRestController.class);
	@Autowired
	private BookService bookService;

	@PostMapping("/addBook")
	public ResponseEntity<String> addBook(@RequestBody Book book) {

		logger.info("Adding new book: {}", book.getBookName());

		boolean addBook = bookService.addBook(book);
		if (addBook) {
			logger.info("Book saved successfully", book);
			return new ResponseEntity<String>("Book saved Sucessfully", HttpStatus.CREATED);
		}
		logger.error("Failed to save the Book", book);
		return new ResponseEntity<String>("Book Failed to save", HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@GetMapping("/getBooks")
	public ResponseEntity<List<BookEntity>> getBooks() {
		logger.info("Getting all books");

		List<BookEntity> books = bookService.getBooks();

		return new ResponseEntity<List<BookEntity>>(books, HttpStatus.OK);
	}

	@GetMapping("/book/{bookId}")
	public Book getBookById(@PathVariable Integer bookId) {
		logger.info("Getting book by ID: {}", bookId);
		Book book = bookService.getBookById(bookId);
		return book;
	}

	@PutMapping("updateBook/{bookId}/{price}")
	public ResponseEntity<String> updateBook(@PathVariable Integer bookId, @PathVariable Double price) {

		logger.info("Updating book with ID {} to price {}", bookId, price);
		boolean updateBook = bookService.updateBook(bookId, price);

		if (updateBook) {
			logger.info("Book updated successfully with ID {}: {}", bookId, price);
			return new ResponseEntity<>("Book updated Sucessfully", HttpStatus.OK);
		} else {
			logger.error("Failed to update book with ID {}: {}", bookId, price);
			return new ResponseEntity<>(" Failed to Updated Book ", HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping("/updateBookById/{bookId}")
	public ResponseEntity<String> updateBookById(@PathVariable Integer bookId, @RequestBody Book book) {
		boolean updateBookById = bookService.updateBookById(bookId, book);
		if (updateBookById) {
			logger.info("Book updated successfully with ID {}: {}", bookId, book);
			return new ResponseEntity<String>("Book updated with ID sucessFully", HttpStatus.OK);
		} else {
			logger.error("Failed to update book with ID {}: {}", bookId, book);
			return new ResponseEntity<String>(" Failed to update Book with ID", HttpStatus.BAD_REQUEST);
		}
	}

	@DeleteMapping("/deleteBook/{bookId}")
	public ResponseEntity<String> deleteBook(@PathVariable Integer bookId) {
		logger.info("Deleting the book with ID {}", bookId);
		boolean deleteBook = bookService.deleteBook(bookId);
		if (deleteBook) {
			logger.info("Book deleted successfully with ID {}", bookId);
			return new ResponseEntity<String>("Book Deleted Sucessfully", HttpStatus.OK);
		} else {
			logger.error("Book not found for deletion with ID {}", bookId);
			return new ResponseEntity<String>("We are unable to find the record to delete", HttpStatus.BAD_REQUEST);
		}

	}
}

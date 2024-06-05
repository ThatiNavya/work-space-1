package com.navyait.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.navyait.binding.Book;
import com.navyait.service.BookWebClientService2;

@RestController
public class BookRestController {
	@Autowired
	private BookWebClientService2 bookService;

	@PostMapping("addingBook")
	public String addBook(@RequestBody Book book) {

		String addBook = bookService.addBook(book);
		return addBook;
	}

	@GetMapping("gettingBooks")
	public String getBooks() {
		String getBooks = bookService.getBooks();
		return getBooks;
	}

	@GetMapping("gettingBookById/{bookId}")
	public String getBookById(@PathVariable Integer bookId) {
		String getBookById = bookService.getBookById(bookId);
		return getBookById;
	}

	@PutMapping("updatingBook/{bookId}/{price}")
	public String updateBook(@PathVariable("bookId") Integer bookId, @PathVariable Double price) {
		String updateBook = bookService.updateBook(bookId, price);
		return updateBook;
	}

	@PutMapping("updatingBookById/{bookId}")
	public String updateBookById(@PathVariable Integer bookId, @RequestBody Book book) {
		String updateBookById = bookService.updateBookById(bookId, book);
		return updateBookById;
	}

	@DeleteMapping("deleteBookById/{bookId}")
	public String deleteBook(@PathVariable Integer bookId) {
		String deleteBookById = bookService.DeleteBook(bookId);
		return deleteBookById;
	}

}

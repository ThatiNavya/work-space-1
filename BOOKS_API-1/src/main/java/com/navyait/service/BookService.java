package com.navyait.service;


import java.util.List;

import com.navyait.binding.Book;
import com.navyait.entity.BookEntity;

public interface BookService {

	public boolean addBook(Book book);
	
	public Book getBookById(Integer bookId);

	public List<BookEntity> getBooks();

	public boolean updateBook(Integer bookId, Double price);
	
	public boolean updateBookById(Integer bookId, Book book);

	public boolean deleteBook(Integer bookId);
	
	


}

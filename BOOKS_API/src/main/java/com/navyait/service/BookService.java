package com.navyait.service;

import java.util.List;

import com.navyait.binding.Book;
import com.navyait.entity.BookEntity;

public interface BookService {

	public boolean addBook(Book book);
	
	public List<BookEntity> getBooks(); 
	
	public boolean updateBook(Integer bookId,Double price);
	
	public boolean deleteBook(Integer bookId);
}

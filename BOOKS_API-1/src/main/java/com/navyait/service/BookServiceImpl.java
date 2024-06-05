package com.navyait.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.navyait.binding.Book;
import com.navyait.entity.BookEntity;
import com.navyait.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	private static final Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);
	@Autowired
	private BookRepository bookrepository;

	@Override
	public boolean addBook(Book book) {
		logger.info("Adding new book: {}", book.getBookName());
		BookEntity bookEntity = new BookEntity();
		BeanUtils.copyProperties(book, bookEntity);
		BookEntity addedBook = bookrepository.save(bookEntity);
		boolean isAdded = addedBook != null && addedBook.getBookId() != null && addedBook.getBookId() > 0;
		if (isAdded) {
			logger.info("Book added Sucessfully with BookbyID:{}", addedBook.getBookId());
		}
		return isAdded;

	}

	@Override
	public Book getBookById(Integer bookId) {
		logger.info("Fetching book by ID: {}", bookId);
		Optional<BookEntity> BookEntityOptional = bookrepository.findById(bookId);
		if (BookEntityOptional.isPresent()) {
			BookEntity bookEntity = BookEntityOptional.get();
			Book book = new Book();
			BeanUtils.copyProperties(bookEntity, book);
			logger.info("Book Found: {}", book.getBookName());
			return book;
		} else {
			logger.warn("Book not found with ID: {}", bookId);
			return null;
		}

	}

	public List<BookEntity> getBooks() {
		logger.info("Fetching all books");

		List<BookEntity> bookEntities = bookrepository.findAll();
		List<BookEntity> books = new ArrayList<>();

		for (BookEntity bookEntity : bookEntities) {
			BookEntity book = new BookEntity();
			BeanUtils.copyProperties(bookEntity, book);
			books.add(book);

		}
		logger.info("Found {} books", books.size());
		return books;
	}

	@Override
	public boolean updateBook(Integer bookId, Double price) {
		logger.info("Updating book with ID: {} to new price: {}", bookId, price);
		Optional<BookEntity> findById = bookrepository.findById(bookId);

		if (findById.isPresent()) {
			BookEntity bookEntity = findById.get();
			bookEntity.setBookPrice(price);
			bookrepository.save(bookEntity);
			return true;
		}
		logger.error("Book with ID {} not found for update", bookId);
		return false;
	}

	@Override
	public boolean updateBookById(Integer bookId, Book book) {
		logger.info("Updating Book with ID: {}", bookId, book);
		Optional<BookEntity> optionalBookEntity = bookrepository.findById(bookId);
		if (optionalBookEntity.isPresent()) {
			BookEntity bookEntity = optionalBookEntity.get();
			if (book.getBookName() != null) {
				bookEntity.setBookName(book.getBookName());
			}
			if (book.getAuthorName() != null) {
				bookEntity.setAuthorName(book.getAuthorName());
			}
			if (book.getBookPrice() != null) {
				bookEntity.setBookPrice(book.getBookPrice());
			}
			bookrepository.save(bookEntity);
			logger.info("Book updated successfully");
			return true;
		}
		logger.debug("Unable to find the Book record with ID:{}", bookId);
		return false;
	}

	@Override
	public boolean deleteBook(Integer bookId) {
		logger.info("Deleting book with ID: {}", bookId);

		Optional<BookEntity> bookEntityOptional = bookrepository.findById(bookId);
		if (bookEntityOptional.isPresent()) {

			bookrepository.delete(bookEntityOptional.get());
			logger.info("Book deleted successfully");
			return true;
		} else {
			logger.error("Failed to delete book. Book not found for ID: {}", bookId);
			return false;
		}
	}

}

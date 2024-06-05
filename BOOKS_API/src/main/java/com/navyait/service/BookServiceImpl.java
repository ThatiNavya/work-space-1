package com.navyait.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.navyait.binding.Book;
import com.navyait.entity.BookEntity;
import com.navyait.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookrepository;

	@Override
	public boolean addBook(Book book) {

		BookEntity bookEntity = new BookEntity();
		BeanUtils.copyProperties(book, bookEntity);
		BookEntity save = bookrepository.save(bookEntity);
		return save.getBookId() != null;
	}

	@Override
	public List<BookEntity> getBooks() {

		return bookrepository.findAll();

	}

	@Override
	public boolean updateBook(Integer bookId, Double price) {
		Optional<BookEntity> findById = bookrepository.findById(bookId);

		if (findById.isPresent()) {
			BookEntity bookEntity = findById.get();
			bookEntity.setBookPrice(price);
			bookrepository.save(bookEntity);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteBook(Integer bookId) {
		try {
			bookrepository.deleteById(bookId);
			return true;
		} catch (Exception e) {

			e.printStackTrace();
		}
		return false;
	}

}

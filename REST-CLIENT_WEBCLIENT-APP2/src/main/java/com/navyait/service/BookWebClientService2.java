package com.navyait.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.navyait.binding.Book;

@Service
public class BookWebClientService2 {

	WebClient client = WebClient.create();

	public String addBook(Book book) {
		String url = "http://localhost:9091/addBook";
		return client.post().uri(url).bodyValue(book).retrieve().bodyToMono(String.class).block();
	}

	public String getBooks() {
		String url = "http://localhost:9091/getBooks";
		return client.get().uri(url).retrieve().bodyToMono(String.class).block();

	}

	public String getBookById(Integer bookId) {
		String url1 = "http://localhost:9091/book/" + bookId;
		return client.get().uri(url1).retrieve().bodyToMono(String.class).block();
	}

	public String updateBook(Integer bookId, Double price) {
		String url = "http://localhost:9091/updateBook/" + bookId + "/" + price;
		return client.put().uri(url).bodyValue(price).retrieve().bodyToMono(String.class).block();
	}

	public String updateBookById(Integer bookId, Book upadatebook) {

		String url = "http://localhost:9091/updatingBookById/" + bookId;
		return client.put().uri(url).bodyValue(upadatebook).retrieve().bodyToMono(String.class).block();

	}
	public String DeleteBook(Integer bookId) {
		String url = "http://localhost:9091/deleteBook/" + bookId;
		return client.delete().uri(url).retrieve().bodyToMono(String.class).block();

	}

}

package com.restTemplate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.restTemplate.binding.Book;

@Service
public class TemplateService2 {

	private final RestTemplate restTemplate;

	@Autowired
	public TemplateService2(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public String addBook(Book book) {
		RestTemplate restTemplate = new RestTemplate();
		String apiUrl1 = "http://localhost:9091/addBook";
		ResponseEntity<String> postForEntity = restTemplate.postForEntity(apiUrl1, book, String.class);
		String body = postForEntity.getBody();
		System.out.println(body);
		return body;
	}

	public String getBooks() {
		RestTemplate restTemplate = new RestTemplate();
		String apiUrl1 = "http://localhost:9091/getBooks";
		ResponseEntity<String> forEntity = restTemplate.getForEntity(apiUrl1, String.class);
		String body1 = forEntity.getBody();
		System.out.println(body1);
		return body1;
	}

	public String getBookById(Integer bookId) {
		RestTemplate restTemplate = new RestTemplate();
		String apiUrl1 = "http://localhost:9091/book/" + bookId;
		ResponseEntity<String> forEntity = restTemplate.getForEntity(apiUrl1, String.class, bookId);
		String body = forEntity.getBody();
		System.out.println(body);
		return body;

	}

	public String updateBookById(Integer bookId, Book updateBook) {

		RestTemplate restTemplate = new RestTemplate();
		String apiUrl1 = "http://localhost:9091/updateBookById/" + bookId;
		restTemplate.put(apiUrl1, updateBook);
		return "Book updated SucessFully";
	}
	
	public String deleteBook(Integer bookId) {
		RestTemplate restTemplate = new RestTemplate();
		String apiUrl1 = "http://localhost:9091/deleteBook/" + bookId;
		restTemplate.delete(apiUrl1, bookId);
		return "book deleted SucessFully";
	}

}
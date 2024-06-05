package com.restTemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.restTemplate.binding.Book;

@SpringBootApplication
public class RestClientRestTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestClientRestTemplateApplication.class, args);

		RestTemplate restTemplate = new RestTemplate();
		String apiUrl = "http://localhost:9091/getBooks";

		ResponseEntity<String> forEntity = restTemplate.getForEntity(apiUrl, String.class);
		String body = forEntity.getBody();
		System.out.println(body);

		String apiUrl1 = "http://localhost:9091/addBook";
		Book book = new Book();
		book.setAuthorName("Aldous Huxley");
		book.setBookName("Brave New World");
		book.setBookPrice(500.0);

		ResponseEntity<String> postForEntity = restTemplate.postForEntity(apiUrl1, book, String.class);
		String resp = postForEntity.getBody();
		System.out.println(resp);

	}

}

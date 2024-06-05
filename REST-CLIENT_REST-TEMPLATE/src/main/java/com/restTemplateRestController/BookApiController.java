package com.restTemplateRestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.restTemplate.binding.Book;

@RestController

public class BookApiController {

	String apiUrl = "http://localhost:9091/getBooks";
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/getBooks")
	public String getBooks(){
		ResponseEntity<String> forEntity = restTemplate.getForEntity(apiUrl, String.class);
		return forEntity.getBody();
	}
	String apiUrl1 = "http://localhost:9091/addBook";
	@PostMapping("/addBook")
	public String addBook(@RequestBody Book book){
		ResponseEntity<String> postForEntity = restTemplate.postForEntity(apiUrl1, book, String.class);
		return postForEntity.getBody();
		
	}
	
}

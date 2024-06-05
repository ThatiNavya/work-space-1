package com.navyait;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

import com.navyait.binding.Book;

@SpringBootApplication
public class RestClientWebclientAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestClientWebclientAppApplication.class, args);

		/*
		 * WebClient webClient = WebClient.create();
		 * 
		 * String apiurl = "http://localhost:9091/addBook";
		 * 
		 * Book book = new Book(); book.setAuthorName("Thirupathi");
		 * book.setBookName("Devil"); book.setBookPrice(296.0);
		 * 
		 * String block =
		 * webClient.post().uri(apiurl).bodyValue(book).retrieve().bodyToMono(String.
		 * class).block(); System.out.println(block);
		 * 
		 * String apiurls = "http://localhost:9091/getBooks";
		 * 
		 * String block2 =
		 * webClient.get().uri(apiurls).retrieve().bodyToMono(String.class).block();
		 * 
		 * System.out.println(block2);
		 */
	}

}

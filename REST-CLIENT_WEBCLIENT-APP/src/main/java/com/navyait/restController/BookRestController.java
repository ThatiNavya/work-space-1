package com.navyait.restController;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.navyait.binding.Book;

import reactor.core.publisher.Mono;

@RestController
public class BookRestController {

    private final WebClient webClient;

    public BookRestController(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://localhost:9091").build();
    }

    @GetMapping("/gettingBooks")
    public List<Book> getExternalBooks() {
        return webClient.get()
                .uri("/getBooks")
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<Book>>() {})
                .block();
    }

    @PostMapping("/addingBook")
    public ResponseEntity<String> addExternalBook(@RequestBody Book book) {
        return webClient.post()
                .uri("/addBook")
                .body(Mono.just(book), Book.class)
                .retrieve()
                .toEntity(String.class)
                .block();
    }
}
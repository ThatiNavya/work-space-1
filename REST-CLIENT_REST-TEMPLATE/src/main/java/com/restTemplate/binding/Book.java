package com.restTemplate.binding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

	private String bookName;

	private Double bookPrice;

	private String authorName;
}

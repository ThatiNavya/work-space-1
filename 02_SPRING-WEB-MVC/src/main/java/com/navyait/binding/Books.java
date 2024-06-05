package com.navyait.binding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
	 private Integer bookId;
	 private String bookName;
	 private Double  bookPrice;
}

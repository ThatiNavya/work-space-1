package com.test;

import com.payment.UPI;
import com.service.BillCollector;

public class Test {
 public static void main(String[] args) {
	 BillCollector b = new BillCollector(new UPI());
	 b.payment(1500.00);
	
}
}

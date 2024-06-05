package com.test;

import com.payment.DebitCard;
import com.service.BillCollector;

public class Test {
 public static void main(String[] args) {
	 BillCollector b = new BillCollector();
	 b.SetPayment(new DebitCard());
	 b.payment(1500.00);
}
}

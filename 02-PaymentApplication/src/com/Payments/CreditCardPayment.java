package com.Payments;

public class CreditCardPayment implements IPayment {

	@Override
	public boolean processPayment(double billAmount) {
		System.out.println("Credit Card Payment Processed...");
		return true;
	}

}

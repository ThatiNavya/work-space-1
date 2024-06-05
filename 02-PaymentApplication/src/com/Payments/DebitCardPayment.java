package com.Payments;

public class DebitCardPayment implements IPayment {

	@Override
	public boolean processPayment(double billAmount) {
		System.out.println("Debit Card Payment Processes...");
		return true;
	}

}

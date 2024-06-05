package com.payment;

public class CreditCard implements Payment {

	@Override
	public String pay() {
		
		return "Payment done through Credit Card";
	}

}

package com.payment;

public class DebitCard implements Payment {

	@Override
	public String pay() {
		
		return "Payment done through Debit Card";
	}
   
}

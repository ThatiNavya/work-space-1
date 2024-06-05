package com.Payments;

public class SodexoPayment implements IPayment {

	@Override
	public boolean processPayment(double billAmount) {
		System.out.println("Sodexo Payment processed...");
		return true;
	}

}

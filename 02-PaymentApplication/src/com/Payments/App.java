package com.Payments;

import com.Payments.CreditCardPayment;

public class App {
	public static void main(String[] args) {

		IPayment p1 = new CreditCardPayment();
		IPayment p2 = new DebitCardPayment();

		PaymentService service1 = new PaymentService(p1); // Constructor Injection
		
		PaymentService service2 = new PaymentService(p1); 
		service2.setPayment(p2);// Setter Injection
		service2.doPayment(1500.0);
	}
}
/*
 * // target class Obj PaymentService service = new PaymentService();
 * 
 * // Injecting dependent Obj into target Obj using target class Setter method
 * service.setPayment(p);
 * 
 * service.doPayment(1500.0);
 */
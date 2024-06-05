package com.Payments;

public class PaymentService {

	private IPayment payment;
	
	public PaymentService( ) {
		System.out.println("Zero Parameterized Constructor...");
	}
	
	public PaymentService(IPayment payment ) {
		this.payment=payment;
	}
	public void setPayment(IPayment payment) {
		this.payment=payment;
	}
	public void doPayment(double billAmount) {
		boolean status  = payment.processPayment(billAmount);
		
		if(status) {
			System.out.println("Printing Recipt...");
		}
		else {
			System.out.println("Payment Declined...");
		}
		
	}
}

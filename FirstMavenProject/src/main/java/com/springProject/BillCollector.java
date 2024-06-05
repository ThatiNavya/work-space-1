package com.springProject;

public class BillCollector {
	private Payment p;

	public void setPayment(Payment p) {
		this.p = p;
	}

	public void billPay(double amount) {
		String result = p.pay();
		System.out.println(result);
	}
}

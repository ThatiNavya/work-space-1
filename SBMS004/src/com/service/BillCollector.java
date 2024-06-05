package com.service;

import com.payment.CreditCard;
import com.payment.Payment;

public class BillCollector {
     private Payment p;
    
		
     public void payment(double amount) {
    	 String result = p.pay();
    	 System.out.println(result);
     }
}

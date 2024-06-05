package in.tcs.beans;

public class CreditCardPayment implements IPayment{

	public CreditCardPayment() {
		System.out.println("CreditCardPayment :: Constructor");
	}
	
	public boolean processPayment(double billAmount) {
		
		System.out.println("CreditCardPayment successfull....");
		
		return true;
	}

}

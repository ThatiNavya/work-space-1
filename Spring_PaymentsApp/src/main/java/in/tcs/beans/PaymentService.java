package in.tcs.beans;

public class PaymentService {

	private IPayment payment;

	public PaymentService() {
		System.out.println("PayementService :: zero Constructor....");
	}

	public PaymentService(IPayment payment) {
		
		System.out.println("PayementService :: para- Constructor....");
		this.payment = payment;
	}
	public void setPayment(IPayment payment) {
		System.out.println("Setter method called");
		this.payment = payment;
	}

	public void doPayment(double billAmount) {
		boolean status = payment.processPayment(billAmount);
		if (status) {
			System.out.println("Recipt Printing....");
		} else {
			System.out.println("Card Declined....");
		}

	}
}

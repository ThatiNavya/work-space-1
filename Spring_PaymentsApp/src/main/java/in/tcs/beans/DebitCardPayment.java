package in.tcs.beans;

public class DebitCardPayment implements IPayment {

	public DebitCardPayment() {
		System.out.println("DebitCardPayment :: Constructor");
	}

	public boolean processPayment(double billAmount) {

		System.out.println("DebitCardPayment successfull....");

		return true;
	}

}

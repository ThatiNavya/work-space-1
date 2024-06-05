package in.tcs.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

		PaymentService Servicebean = context.getBean(PaymentService.class);

		Servicebean.doPayment(1500.0);
	}
}

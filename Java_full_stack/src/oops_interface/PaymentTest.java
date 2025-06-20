package oops_interface;

public class PaymentTest {

	public static void main(String[] args) {

Payment payment;
payment = new CreditCardPayment();
payment.pay(1500.00);
payment = new UpiPayment();
payment.pay(750.50);
}
	}

package oops_interface;


public class UpiPayment implements Payment {
	@Override
	public void pay(double amount) {
		System.out.println("Paid " + amount + " using UPI.");
		}
	}


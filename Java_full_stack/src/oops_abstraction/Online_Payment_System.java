package oops_abstraction;

//Abstract class
abstract class Payment {
 String transactionId;

 Payment(String transactionId) {
     this.transactionId = transactionId;
 }

 // Abstract method
 abstract void processPayment(double amount);

 // Concrete method
 void printReceipt() {
     System.out.println("Transaction ID: " + transactionId);
     System.out.println("Receipt printed successfully.");
 }
}

//Concrete class 1
class CreditCardPayment extends Payment {
 CreditCardPayment(String transactionId) {
     super(transactionId);
 }

 void processPayment(double amount) {
     System.out.println("Processing credit card payment of ₹" + amount);
 }
}

//Concrete class 2
class UPIPayment extends Payment {
 UPIPayment(String transactionId) {
     super(transactionId);
 }

 void processPayment(double amount) {
     System.out.println("Processing UPI payment of ₹" + amount);
 }
}

//Main class
public class Online_Payment_System {
 public static void main(String[] args) {
     Payment payment1 = new CreditCardPayment("TXN12345");
     payment1.processPayment(1500.00);
     payment1.printReceipt();

     System.out.println("----------------------");

     Payment payment2 = new UPIPayment("TXN67890");
     payment2.processPayment(750.00);
     payment2.printReceipt();
 }
}

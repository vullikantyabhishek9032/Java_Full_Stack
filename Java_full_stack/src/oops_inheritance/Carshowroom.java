package oops_inheritance;

//inheritance
//Single Inheritance

//Parent class
class Vehicle {
 String brand = "Toyota";

 void start() {
     System.out.println("Vehicle is starting...");
 }
}

//Child class
class Car extends Vehicle {
 int wheels = 4;

 void displayDetails() {
     System.out.println("Brand: " + brand);
     System.out.println("Number of wheels: " + wheels);
 }
}

//Main class
public class Carshowroom {
 public static void main(String[] args) {
     Car myCar = new Car();
     myCar.start();           // Inherited method
     myCar.displayDetails();  // Child class method
 }
}

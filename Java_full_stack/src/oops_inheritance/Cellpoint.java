package oops_inheritance;

//Inheritance
//Hybrid Inheritance


//Base class
class Device {
 void powerOn() {
     System.out.println("Device is powered on.");
 }
}

//Intermediate class
class Computer extends Device {
 void compute() {
     System.out.println("Computer is computing...");
 }
}

//Interface
interface Portable {
 void carry();
}

//Derived class using hybrid inheritance
class Smartphone extends Computer implements Portable {
 public void carry() {
     System.out.println("Smartphone is portable and easy to carry.");
 }

 void call() {
     System.out.println("Smartphone is making a call.");
 }
}

//Main class
public class Cellpoint {
 public static void main(String[] args) {
     Smartphone phone = new Smartphone();
     phone.powerOn();   // From Device
     phone.compute();   // From Computer
     phone.carry();     // From Portable interface
     phone.call();      // From Smartphone
 }
}

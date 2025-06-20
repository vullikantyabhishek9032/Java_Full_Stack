package oops_polymorphism;

//runtime polymorphism (method overriding with inheritance)

class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting...");
    }
}


class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting with a key...");
    }
}

class Bike extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting with a self-start button...");
    }
}

public class TestVehicle_polymorphism {
    public static void main(String[] args) {
        Vehicle v; 

        v = new Car();   
        v.start();      

        v = new Bike();  
        v.start();     
    }
}

package casting;


class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

public class ObjectReferenceCasting {
    public static void main(String[] args) {
        // Upcasting: Car object is referenced by Vehicle type
        Vehicle v = new Car();  // Implicit upcasting
        v.start();              // Allowed: method in Vehicle

        // Downcasting: Vehicle reference is cast back to Car
        if (v instanceof Car) {
            Car c = (Car) v;    // Explicit downcasting
            c.drive();          // Allowed: method in Car
        } else {
            System.out.println("Downcasting not possible");
        }
    }
}

package oops_polymorphism;

public class Calculator_polymorphism {
	
	//compile-time polymorphism (method overloading)

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator_polymorphism calc = new Calculator_polymorphism();

        System.out.println("Add two integers: " + calc.add(10, 20));
        System.out.println("Add three integers: " + calc.add(5, 15, 25));
        System.out.println("Add two doubles: " + calc.add(10.5, 20.3));
    }
}

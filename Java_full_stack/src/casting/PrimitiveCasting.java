package casting;

public class PrimitiveCasting {
    public static void main(String[] args) {
        // Implicit Casting (Widening)
        int num = 100;
        double doubleNum = num;  // int to double
        System.out.println("Implicit Casting (int to double): " + doubleNum);

        // Explicit Casting (Narrowing)
        double price = 99.99;
        int intPrice = (int) price;  // double to int
        System.out.println("Explicit Casting (double to int): " + intPrice);
    }
}

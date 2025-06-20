package exception_handling;

public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            arr[5] = 10;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds!");
        }
    }
}

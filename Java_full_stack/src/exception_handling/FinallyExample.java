package exception_handling;

public class FinallyExample {
    public static void main(String[] args) {
        try {
            int data = 25 / 5;
            System.out.println("Result: " + data);
        } catch (Exception e) {
            System.out.println("Exception occurred");
        } finally {
            System.out.println("This block always executes");
        }
    }
}

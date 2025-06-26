package problems;
import java.util.Scanner;

//ReverseNumberUsingArray

public class ReverseNumberUsingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();

        // Convert number to string and then to char array
        String numStr = Integer.toString(number);
        char[] digits = numStr.toCharArray();

        // Reverse the array
        System.out.print("Reversed Number: ");
        for (int i = digits.length - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }

        scanner.close();
    }
}

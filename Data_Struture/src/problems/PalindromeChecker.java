package problems;

import java.util.Scanner;

// Check if a String is a Palindrome (Using Array Logic)

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert to lowercase and remove spaces (optional)
        input = input.toLowerCase().replaceAll("\\s+", "");

        // Convert to character array
        char[] chars = input.toCharArray();

        // Check palindrome using two-pointer technique
        boolean isPalindrome = true;
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        // Output result
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }
}

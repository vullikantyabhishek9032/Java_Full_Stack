package problems;

import java.util.Arrays;
import java.util.Scanner;

// Check if Two Strings Are Anagrams

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine().toLowerCase().replaceAll("\\s+", "");

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine().toLowerCase().replaceAll("\\s+", "");

        // Convert strings to char arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted arrays
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

        scanner.close();
    }
}

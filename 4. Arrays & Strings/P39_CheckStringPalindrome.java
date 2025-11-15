/**
 * File: P39_CheckStringPalindrome.java
 * Author: SAROJ DHITAL
 * Description: Program to check if a user-input string is a Palindrome.
 */
import java.util.Scanner;

public class P39_CheckStringPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = input.nextLine();
        String reversed = "";

        // Reverse the string
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed strings
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }
        
        input.close();
    }
}
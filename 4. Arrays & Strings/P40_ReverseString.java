/**
 * File: P40_ReverseString.java
 * Author: SAROJ DHITAL
 * Description: Program to reverse a user-input string.
 */
import java.util.Scanner;

public class P40_ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = input.nextLine();
        String reversed = "";

        // Iterate backwards and build the reversed string
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
        
        input.close();
    }
}
/**
 * File: P25_CheckPalindrome.java
 * Author: SAROJ DHITAL
 * Description: Program to check if a user-input number is a Palindrome 
 * (reads the same forward and backward).
 */
import java.util.Scanner;

public class P25_CheckPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int originalNum = num;
        int reversedNum = 0;

        // Logic to reverse the number
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num = num / 10;
        }

        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a Palindrome number.");
        } else {
            System.out.println(originalNum + " is NOT a Palindrome number.");
        }

        input.close();
    }
}
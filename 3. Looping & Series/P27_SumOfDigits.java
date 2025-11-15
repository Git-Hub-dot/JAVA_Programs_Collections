/**
 * File: P27_SumOfDigits.java
 * Author: SAROJ DHITAL
 * Description: Program to calculate the sum of the digits of a user-input number.
 */
import java.util.Scanner;

public class P27_SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int sum = 0;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10; // Get the last digit
            sum = sum + digit;     // Add to sum
            temp = temp / 10;      // Remove the last digit
        }

        System.out.println("The sum of the digits of " + num + " is: " + sum);
        input.close();
    }
}
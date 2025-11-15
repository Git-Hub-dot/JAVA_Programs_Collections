/**
 * File: P23_Factorial.java
 * Author: SAROJ DHITAL
 * Description: Program to find the Factorial of an entered number (n!).
 */
import java.util.Scanner;

public class P23_Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        long f = 1; // Use long for factorial to prevent overflow

        System.out.print("Enter any non-negative number: ");
        n = input.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            for (int i = 1; i <= n; i++) 
            {
                f = f * i; 
            }
            System.out.println("Factorial of " + n + " is " + f);
        }

        input.close();
    }
}
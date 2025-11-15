/**
 * File: P43_RecursionFactorial.java
 * Author: SAROJ DHITAL
 * Description: Program to calculate the factorial of a number using recursion.
 */
import java.util.Scanner;

public class P43_RecursionFactorial {
    // Recursive method
    public static long calculateFactorial(int n) {
        if (n < 0) {
            return -1; // Indicate error for negative input
        }
        if (n == 0 || n == 1) {
            return 1; // Base case
        }
        // Recursive step: n * (n-1)!
        return n * calculateFactorial(n - 1); 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        
        long result = calculateFactorial(num);
        if (result != -1) {
            System.out.println("Factorial of " + num + " is: " + result);
        } else {
            System.out.println("Factorial is not defined for negative numbers.");
        }

        input.close();
    }
}
/**
 * File: P44_RecursionFibonacci.java
 * Author: SAROJ DHITAL
 * Description: Program to calculate the nth term of the Fibonacci series using recursion.
 */
import java.util.Scanner;

public class P44_RecursionFibonacci {
    // Recursive method to find the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base cases: F(0)=0, F(1)=1
        }
        // Recursive step: F(n) = F(n-1) + F(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2); 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the term number (n): ");
        int n = input.nextInt();
        
        if (n < 0) {
            System.out.println("Invalid input. Please enter a non-negative term number.");
        } else {
            int result = fibonacci(n);
            System.out.println("The " + n + "th Fibonacci term is: " + result);
        }
        
        input.close();
    }
}
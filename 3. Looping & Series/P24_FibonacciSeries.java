/**
 * File: P24_FibonacciSeries.java
 * Author: SAROJ DHITAL
 * Description: Program to print the Fibonacci Series up to 'n' terms.
 */
import java.util.Scanner;

public class P24_FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of terms (n): ");
        int n = input.nextInt();
        
        int a = 0; // First term (F0)
        int b = 1; // Second term (F1)
        
        System.out.print("Fibonacci Series up to " + n + " terms: ");

        for (int i = 1; i <= n; i++) 
        {
            System.out.print(a + " ");
            int nextTerm = a + b; 
            a = b; 
            b = nextTerm; // Next term becomes the second-to-last for the next iteration
        }

        System.out.println();
        input.close();
    }
}
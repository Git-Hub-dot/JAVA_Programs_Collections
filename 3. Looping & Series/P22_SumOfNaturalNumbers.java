/**
 * File: P22_SumOfNaturalNumbers.java
 * Author: SAROJ DHITAL
 * Description: Program to find the sum of first 'n' Natural numbers using a loop.
 */
import java.util.Scanner;

public class P22_SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0; 

        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

        if (n > 0) 
        {
            for (int i = 1; i <= n; i++) 
            {
                sum = sum + i; // Accumulate sum
            }
            System.out.println("Sum of natural numbers from 1 to " + n + " is: " + sum);
        }
        else
        {
            System.out.println("Please enter a positive integer.");
        }

        input.close();
    }
}
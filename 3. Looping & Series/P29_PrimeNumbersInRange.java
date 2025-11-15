/**
 * File: P29_PrimeNumbersInRange.java
 * Author: SAROJ DHITAL
 * Description: Program to print all prime numbers between two user-defined limits.
 */
import java.util.Scanner;

public class P29_PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter lower bound (start): ");
        int start = input.nextInt();
        
        System.out.print("Enter upper bound (end): ");
        int end = input.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + " are:");

        for (int i = start; i <= end; i++) {
            if (i <= 1) continue; // 0 and 1 are not prime
            
            boolean isPrime = true;
            // Check divisibility from 2 up to the square root of i
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        input.close();
    }
}
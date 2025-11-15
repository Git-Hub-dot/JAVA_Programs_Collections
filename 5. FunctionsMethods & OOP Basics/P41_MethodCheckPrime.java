/**
 * File: P41_MethodCheckPrime.java
 * Author: SAROJ DHITAL
 * Description: Program that uses a custom method to check if a number is prime.
 */
import java.util.Scanner;

public class P41_MethodCheckPrime {
    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        input.close();
    }
}
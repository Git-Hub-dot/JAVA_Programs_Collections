/**
 * File: P42_MethodCalculateGCD.java
 * Author: SAROJ DHITAL
 * Description: Program that uses the Euclidean algorithm in a method to find the GCD (Greatest Common Divisor) or HCF.
 */
import java.util.Scanner;

public class P42_MethodCalculateGCD {
    // Method using the Euclidean algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        
        int result = findGCD(num1, num2);
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + result);

        input.close();
    }
}
/**
 * File: P10_CalculatePower.java
 * Author: SAROJ DHITAL
 * Description: Program to calculate the power of a base number raised to an exponent using Math.pow().
 */
import java.util.Scanner;
import java.lang.Math;

public class P10_CalculatePower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter base number: ");
        int base = input.nextInt();
        
        System.out.print("Enter exponent: ");
        int exponent = input.nextInt();

        // Calculate power using Math.pow(base, exponent)
        double result = Math.pow(base, exponent);
        
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        
        input.close();
    }
}
/**
 * File: P05_InterestCalculation.java
 * Author: SAROJ DHITAL
 * Description: Program for Calculation of Simple and Compound Interest.
 */
import java.util.Scanner;
import java.lang.Math;

public class P05_InterestCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter principle (P): ");
        double p = input.nextDouble();
        
        System.out.print("Enter rate of interest (R): ");
        double r = input.nextDouble();
        
        System.out.print("Enter time in years (T): ");
        double t = input.nextDouble();

        // Simple Interest (SI = PRT/100)
        double si = (p * r * t) / 100;
        System.out.printf("\nSimple Interest (SI) = %.2f\n", si);

        // Compound Interest (A = P(1 + R/100)^T)
        double amount = p * Math.pow((1 + r / 100), t);
        double ci = amount - p;
        
        System.out.printf("Compound Amount = %.2f\n", amount);
        System.out.printf("Compound Interest (CI) = %.2f\n", ci);
        
        input.close();
    }
}
/**
 * File: P04_AreaOfCircle.java
 * Author: SAROJ DHITAL
 * Description: Program to find Area of the Circle demonstrating constant definition.
 */
import java.util.Scanner;

public class P04_AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        final double PI = 3.14159; // Defining PI as a constant

        System.out.print("Enter radius of circle: ");
        double r = input.nextDouble();

        double area = PI * r * r;
        
        // Print the result formatted to two decimal places
        System.out.printf("Area of circle = %.2f\n", area);
        
        input.close();
    }
}
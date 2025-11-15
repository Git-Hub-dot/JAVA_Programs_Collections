/**
 * File: P08_CalculateAverage.java
 * Author: SAROJ DHITAL
 * Description: Program to calculate the average of three numbers input by the user.
 */
import java.util.Scanner;

public class P08_CalculateAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        
        System.out.print("Enter third number: ");
        double num3 = input.nextDouble();

        double average = (num1 + num2 + num3) / 3;
        
        System.out.printf("The average of the three numbers is: %.2f\n", average);
        
        input.close();
    }
}
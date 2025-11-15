/**
 * File: P09_FahrenheitToCelsius.java
 * Author: SAROJ DHITAL
 * Description: Program to convert temperature from Fahrenheit to Celsius.
 */
import java.util.Scanner;

public class P09_FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Formula: C = (F - 32) * 5/9
        double celsius = (fahrenheit - 32) * 5 / 9;
        
        System.out.printf("%.2f Fahrenheit is equal to %.2f Celsius.\n", fahrenheit, celsius);
        
        input.close();
    }
}
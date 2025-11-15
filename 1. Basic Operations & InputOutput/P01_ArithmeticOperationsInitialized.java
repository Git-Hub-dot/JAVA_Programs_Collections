/**
 * File: P01_ArithmeticOperationsInitialized.java
 * Author: SAROJ DHITAL
 * Description: Program for basic arithmetic operations (addition, subtraction, 
 * multiplication, division, remainder) using initialized values.
 */
public class P01_ArithmeticOperationsInitialized {
    public static void main(String[] args) {
        int a = 20;
        int b = 20;

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        System.out.println("Addition of " + a + " and " + b + " is " + sum);
        System.out.println("Subtraction of " + a + " and " + b + " is " + difference);
        System.out.println("Multiplication of " + a + " and " + b + " is " + product);
        System.out.println("Division of " + a + " and " + b + " is " + quotient);
        System.out.println("Remainder of " + a + " and " + b + " is " + remainder);
    }
}
/**
 * File: P02_ArithmeticOperationsUserInput.java
 * Author: SAROJ DHITAL
 * Description: Program for basic arithmetic operations using user-input numbers.
 */
import java.util.Scanner;

public class P02_ArithmeticOperationsUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter first number");
        int a = input.nextInt();
        
        System.out.println("Enter second number");
        int b = input.nextInt();

        int sum = a + b;
        // ... other calculations ...

        System.out.println("Addition of " + a + " and " + b + " is " + sum);
        // ... print other results ...
        
        input.close();
    }
}
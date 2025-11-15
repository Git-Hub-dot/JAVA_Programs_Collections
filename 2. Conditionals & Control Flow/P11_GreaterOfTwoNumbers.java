/**
 * File: P11_GreaterOfTwoNumbers.java
 * Author: SAROJ DHITAL
 * Description: Program to find the greatest number among two user-input numbers.
 */
import java.util.Scanner;

public class P11_GreaterOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        if (num1 > num2)
        {
            System.out.println(num1 + " is greater than " + num2);
        }
        else if (num2 > num1)
        {
            System.out.println(num2 + " is greater than " + num1);
        }
        else
        {
            System.out.println("Both numbers are equal");
        }

        input.close();
    }
}
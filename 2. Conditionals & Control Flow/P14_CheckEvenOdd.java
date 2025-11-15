/**
 * File: P14_CheckEvenOdd.java
 * Author: SAROJ DHITAL
 * Description: Program to check if an entered number is even or odd.
 */
import java.util.Scanner;

public class P14_CheckEvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (num == 0) 
        {
            System.out.println("The number is zero.");
        }
        else if (num % 2 == 0) // Check if remainder after division by 2 is 0
        {
            System.out.println("The number is even.");
        }
        else
        {
            System.out.println("The number is odd.");
        }

        input.close();
    }
}
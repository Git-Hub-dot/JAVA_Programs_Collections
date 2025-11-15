/**
 * File: P13_CheckNumberSign.java
 * Author: SAROJ DHITAL
 * Description: Program to check if an entered number is positive, negative, or zero.
 */
import java.util.Scanner;

public class P13_CheckNumberSign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (num > 0) 
        {
            System.out.println("The number is positive.");
        }
        else if (num < 0) 
        {
            System.out.println("The number is negative.");
        }
        else
        {
            System.out.println("The number is zero.");
        }

        input.close();
    }
}
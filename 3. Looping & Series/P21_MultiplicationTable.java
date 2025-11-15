/**
 * File: P21_MultiplicationTable.java
 * Author: SAROJ DHITAL
 * Description: Program to display the multiplication table of a number 'n' using a loop.
 */
import java.util.Scanner;

public class P21_MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number for the table: ");
        int num = input.nextInt();

        System.out.println("Table of " + num + ":"); 
        
        for (int i = 1; i <= 10; i++) 
        {
            System.out.println(num + " x " + i + " = " + (num * i)); 
        }

        input.close();
    }
}
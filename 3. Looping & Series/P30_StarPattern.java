/**
 * File: P30_StarPattern.java
 * Author: SAROJ DHITAL
 * Description: Program to print a right-angled triangle star pattern using nested loops.
 */
import java.util.Scanner;

public class P30_StarPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        for (int i = 1; i <= rows; i++) { // Outer loop for rows
            for (int j = 1; j <= i; j++) { // Inner loop for columns (prints 'i' stars)
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }

        input.close();
    }
}
/**
 * File: P16_CheckLeapYear.java
 * Author: SAROJ DHITAL
 * Description: Program to check if a user-input year is a leap year.
 * Rule: Divisible by 4, unless divisible by 100 but not by 400.
 */
import java.util.Scanner;

public class P16_CheckLeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        boolean isLeap = false;

        if (year % 400 == 0) {
            isLeap = true;
        } else if (year % 100 == 0) {
            isLeap = false;
        } else if (year % 4 == 0) {
            isLeap = true;
        } 

        if (isLeap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        input.close();
    }
}
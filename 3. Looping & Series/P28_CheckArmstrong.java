/**
 * File: P28_CheckArmstrong.java
 * Author: SAROJ DHITAL
 * Description: Program to check if a number is an Armstrong number (sum of cubes of its digits equals the number).
 */
import java.util.Scanner;
import java.lang.Math;

public class P28_CheckArmstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int originalNum = num;
        int sum = 0;
        int temp = num;
        int digits = String.valueOf(num).length(); // Count number of digits

        while (temp > 0) {
            int remainder = temp % 10;
            // Sum of digit raised to the power of number of digits
            sum += Math.pow(remainder, digits); 
            temp = temp / 10;
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is NOT an Armstrong number.");
        }
        
        input.close();
    }
}
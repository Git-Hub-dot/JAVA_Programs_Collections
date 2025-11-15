/**
 * File: P26_ReverseNumber.java
 * Author: SAROJ DHITAL
 * Description: Program to find the Reverse of an entered number.
 */
import java.util.Scanner;

public class P26_ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int reversedNum = 0;
        int temp = num;

        while (temp != 0) {
            int remainder = temp % 10;
            reversedNum = reversedNum * 10 + remainder;
            temp = temp / 10;
        }

        System.out.println("The reversed number is: " + reversedNum);
        input.close();
    }
}
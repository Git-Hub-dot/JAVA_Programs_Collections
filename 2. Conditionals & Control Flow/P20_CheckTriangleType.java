/**
 * File: P20_CheckTriangleType.java
 * Author: SAROJ DHITAL
 * Description: Program to determine if a triangle is Equilateral, Isosceles, or Scalene based on side lengths.
 */
import java.util.Scanner;

public class P20_CheckTriangleType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter side 1: ");
        int s1 = input.nextInt();
        System.out.print("Enter side 2: ");
        int s2 = input.nextInt();
        System.out.print("Enter side 3: ");
        int s3 = input.nextInt();

        if (s1 + s2 <= s3 || s1 + s3 <= s2 || s2 + s3 <= s1) {
             System.out.println("Invalid triangle side lengths.");
        } else if (s1 == s2 && s2 == s3) {
            System.out.println("The triangle is Equilateral (All sides are equal).");
        } else if (s1 == s2 || s1 == s3 || s2 == s3) {
            System.out.println("The triangle is Isosceles (Two sides are equal).");
        } else {
            System.out.println("The triangle is Scalene (No sides are equal).");
        }

        input.close();
    }
}
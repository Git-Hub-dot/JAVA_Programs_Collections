/**
 * File: P03_AreaOfRectangle.java
 * Author: SAROJ DHITAL
 * Description: Program to find the Area of a Rectangle from user input.
 */
import java.util.Scanner;

public class P03_AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter height of rectangle: ");
        int h = input.nextInt();
        
        System.out.print("Enter width of rectangle: ");
        int w = input.nextInt();

        int area = h * w;
        
        System.out.println("Area of rectangle = " + area);
        
        input.close();
    }
}
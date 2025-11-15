/**
 * File: P06_SwapNumbers.java
 * Author: SAROJ DHITAL
 * Description: Program for Swapping of 2 variables using a temporary variable.
 */
import java.util.Scanner;

public class P06_SwapNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the value of a: ");
        int a = input.nextInt();
        
        System.out.print("Enter the value of b: ");
        int b = input.nextInt();

        System.out.println("Before swapping a=" + a + " and b=" + b);

        // Swapping Numbers using a temporary variable
        int temp = a; 
        a = b; 
        b = temp; 

        System.out.println("After swapping a=" + a + " and b=" + b);
        
        input.close();
    }
}
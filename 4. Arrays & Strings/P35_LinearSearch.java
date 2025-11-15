/**
 * File: P35_LinearSearch.java
 * Author: SAROJ DHITAL
 * Description: Program to perform a Linear Search for a key element in an array.
 */
import java.util.Scanner;

public class P35_LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {10, 25, 33, 41, 58, 60}; 
        int position = -1; // Initialize position to -1 (not found)

        System.out.print("Enter the element to search for: ");
        int key = input.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                position = i;
                break; // Element found, exit the loop
            }
        }

        if (position != -1) {
            System.out.println(key + " found at index: " + position);
        } else {
            System.out.println(key + " not found in the array.");
        }

        input.close();
    }
}
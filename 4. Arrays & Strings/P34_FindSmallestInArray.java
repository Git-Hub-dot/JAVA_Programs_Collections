/**
 * File: P34_FindSmallestInArray.java
 * Author: SAROJ DHITAL
 * Description: Program to find the smallest element in an initialized one-dimensional array.
 */
public class P34_FindSmallestInArray {
    public static void main(String[] args) {
        int[] arr = {12, 45, 1, 9, 78, 33}; 
        int min = arr[0]; // Assume first element is the smallest

        // Traverse array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; // Update min if current element is smaller
            }
        }

        System.out.println("The smallest element in the array is: " + min);
    }
}
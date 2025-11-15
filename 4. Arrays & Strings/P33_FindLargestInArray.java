/**
 * File: P33_FindLargestInArray.java
 * Author: SAROJ DHITAL
 * Description: Program to find the largest element in an initialized one-dimensional array.
 */
public class P33_FindLargestInArray {
    public static void main(String[] args) {
        int[] arr = {12, 45, 1, 9, 78, 33}; 
        int max = arr[0]; // Assume first element is the largest

        // Traverse array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if current element is greater
            }
        }

        System.out.println("The largest element in the array is: " + max);
    }
}
/**
 * File: P53_BinarySearchAlgorithm.java
 * Author: SAROJ DHITAL
 * Description: Implements the efficient Binary Search algorithm for finding a target element in a sorted array.
 */
import java.util.Scanner;

public class P53_BinarySearchAlgorithm {

    // Binary Search Method (must be used on a SORTED array)
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Calculate the middle index safely

            if (arr[mid] == target) {
                return mid; // Target found at mid index
            } else if (arr[mid] < target) {
                low = mid + 1; // Target is in the upper half
            } else {
                high = mid - 1; // Target is in the lower half
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        
        System.out.print("Enter the number to search (e.g., 23): ");
        int key = input.nextInt();
        
        int result = binarySearch(sortedArray, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
        
        input.close();
    }
}
/**
 * File: P36_BubbleSort.java
 * Author: SAROJ DHITAL
 * Description: Program to sort an array of integers using the Bubble Sort algorithm.
 */
public class P36_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;

        // Bubble Sort Algorithm
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted array using Bubble Sort: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
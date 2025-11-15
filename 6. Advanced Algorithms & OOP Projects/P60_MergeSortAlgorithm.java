/**
 * File: P60_MergeSortAlgorithm.java
 * Author: SAROJ DHITAL
 * Description: Implements the efficient Merge Sort algorithm (Divide and Conquer) for sorting an array.
 */
public class P60_MergeSortAlgorithm {

    // Main sort method
    public static void mergeSort(int[] arr, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        // Populate left and right subarrays
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = arr[i];
        }

        // Recursively sort the subarrays
        mergeSort(left, mid);
        mergeSort(right, n - mid);

        // Merge the sorted subarrays
        merge(arr, left, right, mid, n - mid);
    }

    // Merge method
    public static void merge(int[] arr, int[] left, int[] right, int leftLen, int rightLen) {
        int i = 0, j = 0, k = 0;
        
        // Compare elements and place them back into the main array
        while (i < leftLen && j < rightLen) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        // Copy remaining elements of left[] if any
        while (i < leftLen) {
            arr[k++] = left[i++];
        }
        // Copy remaining elements of right[] if any
        while (j < rightLen) {
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] data = {12, 11, 13, 5, 6, 7};
        
        System.out.print("Original Array: ");
        for (int x : data) System.out.print(x + " ");
        System.out.println();

        mergeSort(data, data.length);

        System.out.print("Sorted Array (Merge Sort): ");
        for (int x : data) System.out.print(x + " ");
        System.out.println();
    }
}
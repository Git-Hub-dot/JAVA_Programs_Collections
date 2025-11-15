/**
 * File: P37_ReverseArray.java
 * Author: SAROJ DHITAL
 * Description: Program to reverse the elements of an array in place.
 */
public class P37_ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        
        System.out.print("Original array: ");
        for(int x : arr) System.out.print(x + " ");
        System.out.println();

        // Swap elements from the start and end until they meet in the middle
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        System.out.print("Reversed array: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
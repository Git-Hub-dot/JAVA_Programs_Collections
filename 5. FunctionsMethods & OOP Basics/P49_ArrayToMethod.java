/**
 * File: P49_ArrayToMethod.java
 * Author: SAROJ DHITAL
 * Description: Demonstration of Passing an Array to a method and calculating its sum.
 */
public class P49_ArrayToMethod {
    // Method takes an integer array as a parameter
    public static void sumArray(int[] arr) 
    {
        int sum = 0; 
        
        for (int i = 0; i < arr.length; i++) 
        {
            sum = sum + arr[i]; 
        }
        
        System.out.println("Sum of array values: " + sum); 
    }

    // Driver method
    public static void main(String args[]) 
    {
        int arr[] = {1, 2, 3, 4, 5}; 
        sumArray(arr); // Pass the array to the sumArray method
    }
}
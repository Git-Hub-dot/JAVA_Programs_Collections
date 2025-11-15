/**
 * File: P31_MatrixAdditionInitialized.java
 * Author: SAROJ DHITAL
 * Description: Program to find the Sum of two matrices with initialized values.
 */
public class P31_MatrixAdditionInitialized {
    public static void main(String[] args) {
        int[][] mat1 = { 
            {1, 2, 3}, 
            {4, 5, 6} 
        };
        
        int[][] mat2 = { 
            {7, 8, 9}, 
            {1, 2, 3} 
        };

        int rows = mat1.length; 
        int cols = mat1[0].length; 
        
        int[][] sum = new int[rows][cols]; 

        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                sum[i][j] = mat1[i][j] + mat2[i][j]; 
            }
        }

        System.out.println("Sum of the two matrices:"); 
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                System.out.print(sum[i][j] + " "); 
            }
            System.out.println(); 
        }
    }
}
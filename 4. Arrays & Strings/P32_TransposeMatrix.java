/**
 * File: P32_TransposeMatrix.java
 * Author: SAROJ DHITAL
 * Description: Program to find the Transpose of a user input matrix.
 */
import java.util.Scanner;

public class P32_TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows, cols;
        
        System.out.print("Rows: ");
        rows = sc.nextInt();
        
        System.out.print("Cols: ");
        cols = sc.nextInt();
        
        int[][] mat = new int[rows][cols];
        
        System.out.println("Enter matrix elements:");
        
        // Input elements
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Transpose:");
        
        // Print the Transpose matrix by swapping row (j) and column (i) indices
        for (int i = 0; i < cols; i++) 
        {
            for (int j = 0; j < rows; j++) 
            {
                System.out.print(mat[j][i] + " "); 
            }
            System.out.println();
        }
        
        sc.close();
    }
}
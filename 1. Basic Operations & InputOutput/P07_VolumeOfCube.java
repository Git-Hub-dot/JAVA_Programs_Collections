/**
 * File: P07_VolumeOfCube.java
 * Author: SAROJ DHITAL
 * Description: Program to calculate the volume of a cube from user input.
 */
import java.util.Scanner;

public class P07_VolumeOfCube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the side length of the cube: ");
        int side = input.nextInt();

        // Volume = side * side * side
        int volume = side * side * side;
        
        System.out.println("Volume of the cube = " + volume);
        
        input.close();
    }
}
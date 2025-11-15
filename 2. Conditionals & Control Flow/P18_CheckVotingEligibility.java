/**
 * File: P18_CheckVotingEligibility.java
 * Author: SAROJ DHITAL
 * Description: Program to check if a person is eligible to vote (age >= 18).
 */
import java.util.Scanner;

public class P18_CheckVotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            // Calculate years left until eligible
            int yearsLeft = 18 - age;
            System.out.println("You are NOT yet eligible to vote. You can vote in " + yearsLeft + " years.");
        }

        input.close();
    }
}
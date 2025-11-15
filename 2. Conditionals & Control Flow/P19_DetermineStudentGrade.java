/**
 * File: P19_DetermineStudentGrade.java
 * Author: SAROJ DHITAL
 * Description: Program to determine a student's grade based on marks using if-else if ladder.
 */
import java.util.Scanner;

public class P19_DetermineStudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter student's percentage mark (0-100): ");
        int marks = input.nextInt();
        String grade;

        if (marks >= 90) {
            grade = "A+";
        } else if (marks >= 80) {
            grade = "A";
        } else if (marks >= 70) {
            grade = "B";
        } else if (marks >= 60) {
            grade = "C";
        } else if (marks >= 50) {
            grade = "D (Pass)";
        } else {
            grade = "F (Fail)";
        }

        System.out.println("The student's grade is: " + grade);

        input.close();
    }
}
/**
 * File: P51_CustomExceptionDemo.java
 * Author: SAROJ DHITAL
 * Description: Demonstrates creating and using a custom checked exception (InvalidAgeException) for validating user input.
 */

// 1. Define the Custom Exception Class
class InvalidAgeException extends Exception {
    // Constructor
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class P51_CustomExceptionDemo {
    // Method that throws the custom exception
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            // Throw the custom exception if the condition is not met
            throw new InvalidAgeException("Access Denied: Age must be 18 or above.");
        } else {
            System.out.println("Access Granted: Welcome to the voting system.");
        }
    }

    public static void main(String args[]) {
        try {
            // Call the method that throws the exception
            validateAge(15); 
        } catch (InvalidAgeException e) {
            // Catch and handle the custom exception
            System.out.println("Caught an exception: " + e.getMessage());
        }
        
        try {
            validateAge(20);
        } catch (InvalidAgeException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}
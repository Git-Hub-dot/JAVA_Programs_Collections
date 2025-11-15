/**
 * File: P45_BasicCarObject.java
 * Author: SAROJ DHITAL
 * Description: Demonstration of creating a simple class (Car) and instantiating objects.
 */
class Car {
    String model;
    int year;

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class P45_BasicCarObject {
    public static void main(String[] args) {
        // Create an object of the Car class
        Car myCar = new Car(); 
        
        // Access and set object properties
        myCar.model = "Toyota";
        myCar.year = 2020;
        
        myCar.displayDetails();
    }
}
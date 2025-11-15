/**
 * File: P50_MethodOverriding.java
 * Author: SAROJ DHITAL
 * Description: Demonstration of Method Overriding (dynamic polymorphism) where a subclass provides a specific implementation for a method already defined in its superclass.
 */
class Vehicle {
    void run() {
        System.out.println("Vehicle is running on the road.");
    }
}

class Bike extends Vehicle {
    // Overriding the run() method
    @Override
    void run() {
        System.out.println("Bike is running safely at 60 km/h.");
    }
}

public class P50_MethodOverriding {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(); // Calls Vehicle's run()
        Vehicle v2 = new Bike();    // Polymorphic call: calls Bike's run()

        System.out.print("Vehicle object call: ");
        v1.run(); 
        
        System.out.print("Bike object call: ");
        v2.run(); // The actual method called is determined at runtime (dynamic polymorphism)
    }
}
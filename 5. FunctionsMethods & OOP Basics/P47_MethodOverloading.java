/**
 * File: P47_MethodOverloading.java
 * Author: SAROJ DHITAL
 * Description: Demonstration of Method Overloading (static polymorphism) by having methods with the same name but different parameters.
 */
class Calculator {
    // Method 1: Add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method 2: Add two doubles (Overloading by changing data type)
    public double add(double a, double b) {
        return a + b;
    }

    // Method 3: Add three integers (Overloading by changing number of arguments)
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class P47_MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of 10 and 20 (int): " + calc.add(10, 20));
        System.out.println("Sum of 5.5 and 2.3 (double): " + calc.add(5.5, 2.3));
        System.out.println("Sum of 1, 2, and 3 (three int): " + calc.add(1, 2, 3));
    }
}
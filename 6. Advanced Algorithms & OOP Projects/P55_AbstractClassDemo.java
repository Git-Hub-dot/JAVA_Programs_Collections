/**
 * File: P55_AbstractClassDemo.java
 * Author: SAROJ DHITAL
 * Description: Demonstrates the use of an abstract class to define common structure and enforce method implementation in subclasses.
 */

// Abstract class (cannot be instantiated)
abstract class Shape {
    String color;

    // Abstract method (must be implemented by non-abstract subclasses)
    abstract double getArea(); 

    // Concrete method
    public void displayColor() {
        System.out.println("Shape color: " + color);
    }
}

// Subclass implementing the abstract method
class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

// Another subclass
class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }
}

public class P55_AbstractClassDemo {
    public static void main(String[] args) {
        // Polymorphism: references of type Shape pointing to subclass objects
        Shape circle = new Circle("Red", 5.0); 
        Shape rectangle = new Rectangle("Blue", 4.0, 6.0);

        System.out.print("Circle: ");
        circle.displayColor();
        System.out.printf("Circle Area: %.2f\n", circle.getArea());

        System.out.print("Rectangle: ");
        rectangle.displayColor();
        System.out.printf("Rectangle Area: %.2f\n", rectangle.getArea());
    }
}
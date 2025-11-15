/**
 * File: P48_SimpleInheritance.java
 * Author: SAROJ DHITAL
 * Description: Demonstration of single-level inheritance with a Parent (Animal) and Child (Dog) class.
 */
class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

public class P48_SimpleInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        
        // Dog can call its own method
        myDog.bark();
        
        // Dog inherits the method from Animal
        myDog.eat(); 
    }
}
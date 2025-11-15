/**
 * File: P46_StudentClass.java
 * Author: SAROJ DHITAL
 * Description: Demonstration of a class with a constructor and the overridden toString() method.
 */
class Student {
    String name;
    int id;

    // Constructor
    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Overriding toString() for better object representation
    @Override
    public String toString() {
        return "Student [Name: " + name + ", ID: " + id + "]";
    }
}

public class P46_StudentClass {
    public static void main(String[] args) {
        // Objects are created using the constructor
        Student s1 = new Student("SAROJ DHITAL", 101);
        Student s2 = new Student("Alisa", 102);

        // Printing the object automatically calls toString()
        System.out.println(s1);
        System.out.println(s2);
    }
}
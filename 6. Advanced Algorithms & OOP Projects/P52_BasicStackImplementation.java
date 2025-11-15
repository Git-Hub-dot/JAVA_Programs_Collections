/**
 * File: P52_BasicStackImplementation.java
 * Author: SAROJ DHITAL
 * Description: Implements a basic Stack data structure using an array with push, pop, and peek operations.
 */
class ArrayStack {
    private int maxSize;
    private int[] stackArray;
    private int top; // Index of the top element

    public ArrayStack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1; // Stack is initially empty
    }

    // Push operation: Add an element to the top
    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
            System.out.println("Pushed: " + value);
        } else {
            System.out.println("Stack is full. Cannot push " + value);
        }
    }

    // Pop operation: Remove and return the top element
    public int pop() {
        if (top >= 0) {
            int poppedValue = stackArray[top--];
            System.out.println("Popped: " + poppedValue);
            return poppedValue;
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Indicate error
        }
    }

    // Peek operation: Return the top element without removing it
    public int peek() {
        return (top >= 0) ? stackArray[top] : -1;
    }
}

public class P52_BasicStackImplementation {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println("Top element is: " + stack.peek());
        
        stack.pop();
        stack.pop();
        
        stack.push(40);
        stack.pop();
        stack.pop();
        stack.pop(); // Attempt to pop from an empty stack
    }
}
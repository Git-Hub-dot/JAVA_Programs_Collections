/**
 * File: P57_MultithreadingRunnable.java
 * Author: SAROJ DHITAL
 * Description: Demonstrates creating and running multiple threads by implementing the Runnable interface.
 */

// 1. Define the Task (Implementing Runnable)
class MyRunnable implements Runnable {
    private String threadName;

    public MyRunnable(String name) {
        this.threadName = name;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread " + threadName + ", Count: " + i);
                Thread.sleep(50); // Pause for 50 milliseconds
            }
        } catch (InterruptedException e) {
            System.out.println(threadName + " interrupted.");
        }
        System.out.println(threadName + " exiting.");
    }
}

public class P57_MultithreadingRunnable {
    public static void main(String args[]) {
        // Create two tasks
        MyRunnable task1 = new MyRunnable("Thread-Alpha");
        MyRunnable task2 = new MyRunnable("Thread-Beta");

        // Create actual Thread objects
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        // Start execution (calls run() method)
        t1.start();
        t2.start();
    }
}
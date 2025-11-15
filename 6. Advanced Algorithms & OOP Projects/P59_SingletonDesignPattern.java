/**
 * File: P59_SingletonDesignPattern.java
 * Author: SAROJ DHITAL
 * Description: Implementation of the Singleton design pattern, ensuring that only one instance of a class exists.
 */
class Logger {
    // 1. Static instance variable (initialized to null)
    private static Logger instance;

    // 2. Private constructor to prevent external instantiation
    private Logger() {
        System.out.println("Logger instance created (This should only happen ONCE).");
    }

    // 3. Public static method to get the instance
    public static Logger getInstance() {
        // Lazy initialization: create the instance only if it is null
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Business method
    public void log(String message) {
        System.out.println("LOG MESSAGE: " + message);
    }
}

public class P59_SingletonDesignPattern {
    public static void main(String[] args) {
        // Both variables point to the same single instance
        Logger logger1 = Logger.getInstance(); 
        Logger logger2 = Logger.getInstance(); 

        logger1.log("Application started.");
        logger2.log("Configuration loaded.");

        // Prove that both references point to the same object
        if (logger1 == logger2) {
            System.out.println("\nSUCCESS: logger1 and logger2 refer to the same instance (Singleton upheld).");
        } else {
            System.out.println("\nFAILURE: Multiple instances created.");
        }
    }
}
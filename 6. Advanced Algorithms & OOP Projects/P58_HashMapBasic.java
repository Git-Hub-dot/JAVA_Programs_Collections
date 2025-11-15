/**
 * File: P58_HashMapBasic.java
 * Author: SAROJ DHITAL
 * Description: Demonstrates the basic operations of a HashMap (put, get, remove, iteration) using String keys and Integer values.
 */
import java.util.HashMap;
import java.util.Map;

public class P58_HashMapBasic {
    public static void main(String[] args) {
        // Declare and initialize a HashMap
        HashMap<String, Integer> studentScores = new HashMap<>();

        // 1. Put (insert) key-value pairs
        studentScores.put("Saroj", 95);
        studentScores.put("Kalika", 88);
        studentScores.put("Shiva", 75);
        System.out.println("Initial Map: " + studentScores);

        // 2. Get value by key
        int sarojScore = studentScores.get("Saroj");
        System.out.println("\nSaroj's Score: " + sarojScore);

        // 3. Update value
        studentScores.put("Kalika", 92);
        
        // 4. Check if key exists
        if (studentScores.containsKey("Shiva")) {
            System.out.println("Shiva is in the map.");
        }

        // 5. Iterate over key-value pairs (EntrySet)
        System.out.println("\nIterating through the map:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println("Student: " + entry.getKey() + ", Score: " + entry.getValue());
        }
        
        // 6. Remove a key-value pair
        studentScores.remove("Shiva");
        System.out.println("\nMap after removing Shiva: " + studentScores);
    }
}
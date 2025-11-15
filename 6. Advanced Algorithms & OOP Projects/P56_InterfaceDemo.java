/**
 * File: P56_InterfaceDemo.java
 * Author: SAROJ DHITAL
 * Description: Demonstrates implementing multiple interfaces (Drawable and Sortable) by a single class.
 */

// Interface 1
interface Drawable {
    void draw(); // Abstract method
}

// Interface 2
interface Sortable {
    void sort(int[] arr); // Abstract method
}

// Class implements both interfaces, providing concrete implementation for both methods
class GraphicProcessor implements Drawable, Sortable {
    
    @Override
    public void draw() {
        System.out.println("Drawing a vector graphic on screen.");
    }
    
    @Override
    public void sort(int[] arr) {
        // Implementation of a simple sort (e.g., Bubble Sort)
        java.util.Arrays.sort(arr);
        System.out.print("Array sorted: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

public class P56_InterfaceDemo {
    public static void main(String[] args) {
        GraphicProcessor processor = new GraphicProcessor();
        int[] data = {5, 2, 8, 1};

        processor.draw();
        processor.sort(data); 
    }
}
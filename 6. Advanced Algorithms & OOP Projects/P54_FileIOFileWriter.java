/**
 * File: P54_FileIOFileWriter.java
 * Author: SAROJ DHITAL
 * Description: Demonstrates basic file writing and reading using FileWriter, BufferedWriter, FileReader, and BufferedReader.
 */
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class P54_FileIOFileWriter {
    private static final String FILE_NAME = "notes.txt";

    public static void main(String[] args) {
        String content = "This is the first line.\nThis is the second line written to the file.";

        // 1. Writing to a file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            writer.write(content);
            System.out.println("Successfully wrote content to " + FILE_NAME);
        } catch (IOException e) {
            System.out.println("An error occurred during writing: " + e.getMessage());
        }

        // 2. Reading from the file
        System.out.println("\nReading from file:");
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred during reading: " + e.getMessage());
        }
    }
}
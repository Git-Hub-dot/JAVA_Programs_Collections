/**
 * File: P38_CountVowelsConsonants.java
 * Author: SAROJ DHITAL
 * Description: Program to count the number of vowels and consonants in a user-input string.
 */
import java.util.Scanner;

public class P38_CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine().toLowerCase(); // Convert to lower case for easy checking

        int vCount = 0;
        int cCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (ch >= 'a' && ch <= 'z') { // Check if the character is an alphabet
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vCount++;
                } else {
                    cCount++;
                }
            }
        }

        System.out.println("Vowels: " + vCount);
        System.out.println("Consonants: " + cCount);
        input.close();
    }
}
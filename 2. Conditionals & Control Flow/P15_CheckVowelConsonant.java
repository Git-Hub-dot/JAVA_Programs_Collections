/**
 * File: P15_CheckVowelConsonant.java
 * Author: SAROJ DHITAL
 * Description: Program to check if the entered alphabet is a Vowel or Consonant.
 */
import java.util.Scanner;

public class P15_CheckVowelConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an alphabet: ");
        // Read the first character and convert to lowercase for uniform checking
        char ch = Character.toLowerCase(input.next().charAt(0)); 

        if (ch >= 'a' && ch <= 'z') 
        {
            // Check for lowercase vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
            {
                System.out.println(ch + " is a vowel."); 
            }
            else
            {
                System.out.println(ch + " is a consonant."); 
            }
        }
        else
        {
            System.out.println("Input is not a standard English alphabet."); 
        }

        input.close();
    }
}
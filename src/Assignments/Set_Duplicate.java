package Assignments;

//Java program to find duplicate characters in a string
//String s = "Traffic" -> use Collection concept

import java.util.HashSet;
import java.util.Set;

public class Set_Duplicate {

    public static void main(String[] args) {

        // Creating a Set to store characters that appear for the first time
        Set<Character> unique = new HashSet<>();

        // Creating another Set to store duplicate characters
        Set<Character> duplicate = new HashSet<>();

        // Input string
        String s = "Traffic";

        // Converting the string into character array and looping through each character
        for (char c : s.toCharArray()) {

            /*
             unique.add(c) tries to add character 'c' to the Set

             - If character is added for the FIRST time → returns true
             - If character already exists → returns false

             !unique.add(c) means:
             "If the character could NOT be added"
             i.e., the character is already present → duplicate found
            */
            if (!unique.add(c)) {

                // Adding the duplicate character into duplicate Set
                duplicate.add(c);
            }
        }

        // Printing all duplicate characters
        System.out.println("Duplicate characters: " + duplicate);
    }
}


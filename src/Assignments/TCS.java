package Assignments;
//
//input- This is a tcs interview
//output- weivretni sct a si sihT

public class TCS {
    public static void main(String[] args) {


        // Input string
        String input = "This is a tcs interview";

        // Convert string into character array
        char[] ch = input.toCharArray();

        // Loop from last character to first
        for (int i = ch.length - 1; i >= 0; i--) {

            // Print each character
            System.out.print(ch[i]);
        }
    }
}



package Array;

public class PrintCapitalLetters {
    public static void main(String[] args) {

        String s = "JavaIsaprogRamMinGlangUage";  // given string

        // Loop through every character in the string
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);  // get each character

            // Check if the character is a capital letter
            // Capital letters range from 'A' to 'Z' in ASCII
            if (ch >= 'A' && ch <= 'Z') {

                System.out.println(ch);  // print only capital letters
            }
        }
    }
}

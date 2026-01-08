package Array;

public class Word_Count {


        public static void main(String[] args) {

            // We create a string variable 's' and store a sentence inside it
            String s = "Java is a good programming language";

            // trim() removes extra spaces at the beginning or end of the string (if any)
            s = s.trim();

            // split("\\s+") breaks the string wherever it finds one or more spaces
            // \\s+ means "one or more white spaces" (space, tab, etc.)
            // The result is an array of words
            String[] words = s.split("\\s+");

            // words.length tells how many elements are in the array
            // That equals the number of words in the sentence
            int count = words.length;

            // Print the total number of words
            System.out.println("Number of words: " + count);
        }
    }




package Array;

public class EvenIndexCharacters {
    public static void main(String[] args) {

        String s = "Programming";   // given string

        // Loop through each index of the string
        for (int i = 0; i < s.length(); i++) {

            // Check if index is even
            if (i % 2 == 0) {

                // Print the character at that even index
                char ch = s.charAt(i);
                System.out.println("Index " + i + " -> " + ch);
            }
        }
    }
}

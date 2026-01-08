package Array;

public class Array_Duplicate_String {

        public static void main(String[] args) {           // Main method (execution starts here)

            String s = "Programming";                      // Creating a String variable
            char[] arr = s.toCharArray();                  // Convert the string into a char array

            System.out.println("Duplicate characters:");

            for (int i = 0; i < arr.length; i++) {         // Loop through each character by finding the length of the array

                for (int j = i + 1; j < arr.length; j++) { // Compare current char with the rest ahead (We use j = i + 1 to compare the current character only with the characters that come after it, so that we avoid comparing the same pair again and again

                    if (arr[i] == arr[j]) {                // If both characters are same
                        System.out.println(arr[i]);        // Print this duplicate character
                        break;                             // Stop inner loop so we print only once
                    }
                }
            }
        }                                                  // End of main method
    }                                                      // End of class



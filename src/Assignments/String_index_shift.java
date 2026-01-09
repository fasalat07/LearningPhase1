package Assignments;
//question
//Java program to gives Output: “32412120000” for the Input String Str = “32400121200”


public class String_index_shift {

    public static void main(String[] args) {

        //convert this to a char array for filtering zeros
        String str = "32400121200";

        // now string will be converted to individual characters and stored in array
        char[] arr = str.toCharArray();


        // Create a result array with the same length
        char[] result = new char[arr.length];

        // Index to track the position for non-zero characters
        int index = 0;


        // start for each loop to iterate through array
        // Datatype is character as we converted string to char to separate zero

        for (char c : arr) {

            // If the character is NOT '0'
            if (c != '0') {

                // Place the character in result array
                result[index] = c;

                // Move index to the next position
                index++;
            }


        }
        System.out.println(result);
        // how zeros are coming at the end ? because when we initiated result array initially it will look like
        //['\0','\0','\0','\0','\0','\0','\0','\0','\0','\0','\0']
        //We copy ONLY non-zero characters and So we fill from the front

    }





}

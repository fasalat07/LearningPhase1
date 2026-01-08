package String;

public class SubString {

        public static void main(String[] args) {

            // Create a string variable named 's'
            String s = "JavaProgramming";

            // ------------------------------
            // Example 1: substring(beginIndex)
            // ------------------------------
            // substring(4) means:
            // start from index 4 and take all characters till the end of the string.
            //
            // Index positions:
            // J(0) a(1) v(2) a(3) P(4) r(5) o(6) g(7) r(8) a(9) m(10) m(11) i(12) n(13) g(14)
            //
            // So, starting from index 4 → 'P' → the output will be: "Programming"
            System.out.println(s.substring(4)); // Output: Programming


            // ------------------------------
            // Example 2: substring(beginIndex, endIndex)
            // ------------------------------
            // substring(0, 4) means:
            // start from index 0 and go up to (but NOT including) index 4.
            //
            // Important:
            // - beginIndex is inclusive → starts from that index.
            // - endIndex is exclusive → stops before that index.
            //
            // So, from index 0 to 3, the characters are:
            // J(0), a(1), v(2), a(3)
            // Output → "Java"
            System.out.println(s.substring(0, 4)); // Output: Java

            // Note:
            // If you wanted the first 4 letters, you give endIndex as 4 (not 3),
            // because substring excludes the endIndex character.
        }
    }



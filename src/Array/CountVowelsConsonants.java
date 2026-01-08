package Array;

public class CountVowelsConsonants {

        public static void main(String[] args) {

            String s = "GoodmorningBadNight";  // given string

            s = s.toLowerCase();               // convert to lowercase to avoid capital letter issues

            int vowels = 0;
            int consonants = 0;

            for (int i = 0; i < s.length(); i++) {   // loop through each character
                char ch = s.charAt(i);               // get each character

                // Check if it is a letter a-z
                if (ch >= 'a' && ch <= 'z') {

                    // Check if it's a vowel
                    if ("aeiou".contains(ch + "")) {
                        vowels++;
                    } else {
                        consonants++;
                    }
                }
            }

            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
        }
    }



package Array;

public class PrintTwice {

    public static void main(String[] args) {

        String s = "IamGood";   // given string

        for (int i = 0; i < s.length(); i++) {   // loop through each character

            char ch = s.charAt(i);               // get each character

            // print the character two times
            System.out.print(ch + "" +ch);
           
        }
    }
}

package String;

public class Comapre {
    public static void main(String[] args) {

        String s = "Java";
        String s1 = "javaP";

        System.out.println(s.compareTo(s1));

        System.out.println(s.compareToIgnoreCase(s1));

        /*
        point of reference is S
        comparing the number of content/character with another string s1.
        difference of s1 compared with s.
        it will return intger
         */

    }
}

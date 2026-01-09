package Assignments;
//Input: JavApRogr2m
//Output: J@@A@R@@@&@


public class String_Replacement_02 {

    public static void main (String[] args){

        String input = "JavApRogr2m";

        String output = input.replaceAll("[a-z]", "@")   // replace lowercase letters
                .replaceAll("[0-9]", "&");  // replace digits

        System.out.println(output);

    }
}

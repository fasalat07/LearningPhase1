package Assignments;

//Java program to find duplicate characters in a string
//String s = "Traffic" -> use Collection concept

import java.util.HashSet;
import java.util.Set;

public class Set_Duplicate {

    public static void main(String[] args) {




        Set r  = new HashSet(); //declaration and inititalization

        String s = "Traffic";

        for (char c : s.toCharArray()){

            r.add(c);

        }

        System.out.println(r);

    }

}

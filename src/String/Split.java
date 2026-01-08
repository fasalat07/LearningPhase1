package String;

import java.util.Arrays;

public class Split {
    public static void main(String[] args) {


        String s = "Java is a Programming";
        String[] s1 = s.split(" "); //{"Java","is", "a","Programming"}
        for (int i = 0; i <s1.length; i++){

            System.out.println(s1[i]);

        }


    }
}


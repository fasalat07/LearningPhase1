package Assignments;

//String “GoodMorningGoodAfternoonGoodNight”
//output = “GoodMorningGoodAfternoonBadNight”
//Replace 3rd good with bad.

public class ReplaceString {

    public static void main(String[] args) {
//
//
        // Original input string
        String str = "GoodMorningGoodAfternoonGoodNight";

        // Find the index of the FIRST occurrence of "Good"
        int first = str.indexOf("Good");
        System.out.println(first);

        // Find the index of the SECOND occurrence of "Good"
        // Search starts after the first occurrence
        int second = str.indexOf("Good", first + 1);
        System.out.println(second);

        // Find the index of the THIRD occurrence of "Good"
        // Search starts after the second occurrence
        int third = str.indexOf("Good", second + 1);
        System.out.println(third);



    }

}













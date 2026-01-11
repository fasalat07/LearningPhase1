package Assignments;

//String “GoodMorningGoodAfternoonGoodNight”
//output = “GoodMorningGoodAfternoonBadNight”
//Replace 3rd good with bad.

public class ReplaceString {

    public static void main(String[] args) {

        String str = "GoodMorningGoodAfternoonGoodNight";

        int index = str.lastIndexOf("Good");
        String Output = str.substring(0,index)+"Bad"+str.substring(index+4);
        System.out.println(Output);



    }

}













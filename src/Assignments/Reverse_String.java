package Assignments;

//"input: String str = "Test45@W";
//output: West45@T

public class Reverse_String {

    public static void main(String[] args) {

        String str = "Test45@W";
        char[] ch = str.toCharArray();

        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
    }
}


package Incriment_decriment;

//Print the value of a
//int a=1;
//a = a++ + ++a * --a - a--;

public class P04 {
    public static void main(String[] args) {

        int a = 1;
        a = a++ + ++a * --a - a--;
        //  1+3*2-2 = 1+6-2 = 1+4 =5
        // value of a is 2 in first iteration
        // value of a is 3 in first iteration
        System.out.println(a);
    }
}

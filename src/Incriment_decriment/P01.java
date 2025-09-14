package Incriment_decriment;

public class P01 {
    public static void main(String[] args) {

        int a=1;  //1

        int b= (a++ + ++a) * --a - a--;
        //   1  +   3   *  2 -  2
        // 4 * 2-2
        // 8 -2
        // 6
        // bodmas rule = B(bracket)O(multiply)D(division)A(Addition)S(Substarction)


        System.out.println(a);

    }
}


package Incriment_decriment;

public class P03 {

    public static void main(String[] args) {


        // Print the value of P
        int m = 0, n = 0;
        //  -2     -2
        int p = --m * --n * n-- * m--;
        //      -1    -1   -1   -1
        //       1*1


        System.out.println(p);
    }
}

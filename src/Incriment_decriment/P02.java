package Incriment_decriment;

public class P02 {
    public static void main(String[] args) {

        int x = 1, y=10, z=100;
        //  x= -2 , y=11, z=98

        int i = --x + y++ - z-- - --z + ++y - --x + y-- - --x;
        //       0   + 10  - 100 - 98  + 12  - (-1)  + 12  - (-2)
        //       10  - 100 - 125
        //       -90 - 125
        //


        System.out.println("x="+x);// value of x is -2
        System.out.println("y="+y); // value of y is 11
        System.out.println("z="+z); // value of z is 98
        System.out.println("i="+i);
    }
}

package Incriment_decriment;


//int a = 11;
//int b = ++a;
//System.out.println(a);
//System.out.println(b);

public class PO7 {
    public static void main(String[] args) {


        int a = 11;           // a is initialized with 11
        int b = ++a;          // pre-increment (++a):
        // 1) a is incremented first → a = 12
        // 2) the new value of a is assigned to b
        // so, a = 12 and b = 12

        System.out.println(a); // prints 12 (since a was incremented)
        System.out.println(b); // prints 12 (since b got the incremented value)
    }
    }


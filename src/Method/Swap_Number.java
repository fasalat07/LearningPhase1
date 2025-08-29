package Method;

//Java program to swap two numbers without using third variable

public class Swap_Number {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        System.out.println("Original value of a is " + a + "\nOriginal value of b is " + b);
        getSwap(a,b);

    }

    public static void getSwap(int a, int b){

        a = a+b; // 10+20 = 30
        b = a-b; // 30-20 = 10
        a = a-b; // 30- 10 = 29

        System.out.println("Swapped value of a is = " + a + "\nSwapped value of b is = " + b);



    }
}

package Operator;

public class Conditional_Operator {
    public static void main(String[] args) {



    int a = 10;
    int b=  20;
    int c = 30;


    // operator we can user here is condition ? value_if_true : value_if_false

    // Step 1: Find greater between a and b
    int temp = ( a > b) ? a : b ;
    //operator is basically a short-term for if-else

    // Step 2: Find greater between result1  and c
    int greatest = (temp > c) ? temp : c;

    System.out.println("The greatest number is: " + greatest);
}
}
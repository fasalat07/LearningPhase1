package PolyMorphism;

public class MethodOverloading {





    public static void sum(int a,int b)
    {
        System.out.println(a+b);
    }

    public static void sum(int a,double b)
    {
        System.out.println(a+b);
    }

    public static void sum(double a,double b)
    {
        System.out.println(a+b);
    }

    public static void sum(int a,int b, int c)
    {
        System.out.println(a+b+c);
    }

    public static void sum(int a,int b, int c, int d)
    {
        System.out.println(a+b+c+d);
    }


    public static void main(String[] args) {
        sum(2,3.5);
        sum(2.3,3.4);
        sum(1,2,3);
        sum(5,90,18,60);
    }
}

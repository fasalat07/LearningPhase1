package PolyMorphism;

public class MethodOveriding {
    public void sum(int a,int b)
    {
        System.out.println("this method will perform addition");
    }

    public void disp()
    {
        System.out.println("this method will perform display");
    }



    public static void main(String[] args) {
        MethodOveriding obj=new MethodOveriding();
        obj.sum(2,3);
    }
}

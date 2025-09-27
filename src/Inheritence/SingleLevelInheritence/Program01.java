package Inheritence.SingleLevelInheritence;

public class Program01 {
    int a = 10;

    static int b = 20;

    public void parentNSmethod()
    {
        System.out.println("NS method from parent");
    }

    static public void parentSmethod()
    {
        System.out.println("static method from parent");
    }

    public static void main(String[] args) {
        System.out.println(b); //static
        Program01 obj = new Program01();
        System.out.println(obj.a);

        parentSmethod();
        obj.parentNSmethod();


    }
}

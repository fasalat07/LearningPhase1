package Inheritence.SingleLevelInheritence;

public class Program02 extends Program01 {
    int c = 11;

    static int d = 21;
    static int b = 23;

    public void childNSmethod()
    {

        System.out.println("NS method from child");
    }

    static public void childSmethod()
    {

        System.out.println("static method from child");
    }

    public static void main(String[] args) {
        System.out.println(d); //static
        Program02 obj = new Program02();
        System.out.println(obj.c);

        childSmethod();
        obj.childNSmethod();
        System.out.println("=========================================");
        System.out.println("Without using extends keyword");

        //both are in same package and are public
        System.out.println(Program01.b);
        Program01 obj1 = new Program01();
        obj1.parentNSmethod();
        System.out.println(obj1.a);
        System.out.println("============================================");

        System.out.println("with using extends keyword");
        Program02 child = new Program02();
        child.childNSmethod();
        System.out.println(child.c);
        System.out.println(child.d);
        child.childSmethod();
        System.out.println("Single level inheritence: using child object i am accessing parent members");
        System.out.println(child.a);
        System.out.println(child.b);
        child.parentNSmethod();
        child.parentSmethod();
        System.out.println(b);// from child
        System.out.println(Program01.b); // from parent


    }
}

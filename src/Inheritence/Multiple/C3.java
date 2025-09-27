package Inheritence.Multiple;

public class C3 extends Parent {
    int d = 40;

    public static void main(String[] args) {
        C3 obj =new C3();
        System.out.println(" from parent" + "  " +obj.d);
        System.out.println(" from child " + "" +obj.a);
        //System.out.println(obj.b); - not possible from siblings
        //System.out.println(obj.c); - not possible from siblings
    }
}

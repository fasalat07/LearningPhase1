package Constructor;

public class Child_chaining extends Parent_Chaining {

    Child_chaining()
    {
        //super() will always be there as the 1st line defined by JVM.
        this(2,3);
        System.out.println("from child default constructor");
    }

    Child_chaining(int a,int b)
    {
        System.out.println("from child 2 param constructor");
    }

    public static void main(String[] args) {
        Child_chaining obj = new Child_chaining();
    }

}

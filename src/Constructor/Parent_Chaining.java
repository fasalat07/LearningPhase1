package Constructor;

public class Parent_Chaining {

    Parent_Chaining (){
        this(2,3);
        System.out.println("from parent default constructor");
    }

    Parent_Chaining(int a,int b)
    {
        System.out.println("from parent 2 param constructor");
    }
}

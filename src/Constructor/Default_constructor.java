package Constructor;

public class Default_constructor {
    Default_constructor()
    {
        System.out.println("this is from default const");
    }

    {
        System.out.println("non static block");
    }


    public static void main(String[] args) {
        Default_constructor obj = new Default_constructor(); //created an object
    }
}

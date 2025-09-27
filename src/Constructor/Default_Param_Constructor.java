package Constructor;

public class Default_Param_Constructor {
    int a = 10;

    //JVM will create a default constructor
    Default_Param_Constructor()
    {
        System.out.println("this is from default constructor");
    }

    Default_Param_Constructor(int a,int b)
    {
        int num = a+b;
        System.out.println("this is from param constructor" + " " + " the sum is " + num);
    }

    public static void main(String[] args) {
        Default_Param_Constructor obj = new Default_Param_Constructor();



        Default_Param_Constructor obj1 = new Default_Param_Constructor(2,3);

    }
}


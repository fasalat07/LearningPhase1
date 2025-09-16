package Static_Non_static;

public class StaticExample {

    static int number = 10;

    public static void main(String[] args) {

        // 1. Access directly (since main is also static)
        System.out.println("Direct access: " + number);

        // 2. Access using class name
        System.out.println("Using class name: " + StaticExample.number);

        // 3. (Not recommended) Access using object
        StaticExample obj = new StaticExample();
        System.out.println("Using object: " + obj.number);
    }
}

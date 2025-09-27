package Constructor;

public class Child extends Parent{
    // Default constructor
    Child() {
        this(10);  // calls the overloaded constructor
        System.out.println("Inside Child default constructor");
    }

    // Overloaded constructor
    Child(int x) {
        super();   // calls Parent constructor
        System.out.println("Inside Child overloaded constructor with value: " + x);
    }

    public static void main(String[] args) {
        Child obj = new Child();
    }
}

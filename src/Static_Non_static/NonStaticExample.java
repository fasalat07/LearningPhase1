package Static_Non_static;

class NonStaticExample {
    // non-static (instance) variable
    int number = 10;

    public static void main(String[] args) {
        //  Cannot access directly inside static main
        // System.out.println(number); // ERROR

        //  Need to create an object to access non-static variables
        NonStaticExample obj = new NonStaticExample();
        System.out.println("Accessing non-static variable: " + obj.number);

        // You can create another object
        NonStaticExample obj2 = new NonStaticExample();
        obj2.number = 20; // change value for obj2

        System.out.println("First object number: " + obj.number);
        System.out.println("Second object number: " + obj2.number);
    }
}


package Static_Non_static;

class NonStaticMethodExample {
    // non-static method
    void greet() {
        System.out.println("Hello! This is a non-static method.");
    }

    public static void main(String[] args) {
        // Cannot call greet() directly here, because main is static

        //  Need to create an object to call non-static methods
        NonStaticMethodExample obj = new NonStaticMethodExample();
        obj.greet();
    }
}


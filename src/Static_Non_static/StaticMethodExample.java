package Static_Non_static;

class StaticMethodExample {
    // static method
    static void greet() {
        System.out.println("Hello! This is a static method.");
    }

    public static void main(String[] args) {
        // 1. Call directly (since main is also static)
        greet();

        // 2. Call using class name (preferred)
        StaticMethodExample.greet();
    }
}


package Static_Non_static;

public class NS_and_S {

    // 🔹 Non-static (instance) variable
    int nsVar = 10;

    // 🔹 Static variable
    static int sVar = 20;

    // 🔹 Non-static block (runs every time an object is created)
    {
        System.out.println("Inside NON-STATIC block → Runs when object is created");
    }

    // 🔹 Static block (runs only once when class is loaded)
    static {
        System.out.println("Inside STATIC block → Runs once when class is loaded");
    }

    // 🔹 Non-static method
    void nonStaticMethod() {
        System.out.println("Inside NON-STATIC method → nsVar = " + nsVar);
    }

    // 🔹 Static method
    static void staticMethod() {
        System.out.println("Inside STATIC method → sVar = " + sVar);
    }

    // 🔹 main method
    public static void main(String[] args) {
        System.out.println("Inside MAIN method...");

        // 1. Call static method directly
        staticMethod();

        // 2. Call static method using class name (recommended way)
        NS_and_S.staticMethod();

        // 3. Access static variable directly
        System.out.println("Static variable (direct): " + sVar);

        // 4. Access static variable using class name
        System.out.println("Static variable (class name): " + NS_and_S.sVar);

        // 5. Create object (this triggers NON-STATIC block automatically)
        NS_and_S obj = new NS_and_S();

        // 6. Access non-static variable using object
        System.out.println("Non-static variable: " + obj.nsVar);

        // 7. Call non-static method using object
        obj.nonStaticMethod();
    }
}

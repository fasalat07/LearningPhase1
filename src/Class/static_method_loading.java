package Class;

class Test {

    // ---- Static Block ----
    // This runs automatically when the class is loaded,
    // even before the main() method starts.
    static {
        System.out.println("Inside static block");

        // Here we are calling multiply(2,3) inside static block.
        // Since multiply() is a static method, it belongs to the class
        // and is available during class loading.
        // So this executes immediately and prints: "Call static method here: 6"
        System.out.println("Call static method here: " + multiply(2, 3));
    }

    public static void main(String[] args) {
        // ---- Main Method ----
        // After static blocks are done, program execution starts here.
        System.out.println("Inside main method");

        // Now we again call multiply(2,3) inside main().
        // It will again return 6 and print:
        // "Call method here: 6"
        int result = multiply(2, 3);
        System.out.println("Call method here: " + result);
    }

    // ---- Static Method ----
    // multiply() is defined at class level, so it can be
    // called both inside static blocks and inside main().
    static int multiply(int a, int b) {
        return a * b;
    }
}


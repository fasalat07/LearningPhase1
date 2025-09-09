package Class;

public class ClassLoading {



        // -------- Step 1 (class loading starts) --------
        // Static blocks execute in the order they appear when the class is first loaded.
        // They run BEFORE main(), because JVM must fully initialize the class first.
        static {
            System.out.println("from static block1");
        }

        // Constructor (runs later, when object is created)
        ClassLoading() {
            System.out.println("from constructor");
        }

        static int i = 10; // static variable (initialized at class load time)

        int j = 20; // non-static variable (created fresh for each object)

        // -------- Step 3 (object creation) --------
        // Non-static block runs each time a new object is created,
        // BEFORE the constructor, after instance variables are set.
        {
            System.out.println("from non static block");
        }

        // Static method (can be called without object)
        public static void meth() {
            System.out.println("from static method");
        }

        // Non-static method (requires an object)
        public void meth1() {
            System.out.println("from non-static method");
        }

        public static void main(String[] args) {
            // -------- Step 2 (main starts after class load) --------
            System.out.println("program started");
            System.out.println("1st line of main method");

            // -------- Step 3 (object creation happens here) --------
            ClassLoading obj = new ClassLoading(); // triggers non-static block, then constructor

            // -------- Step 4 (method calls in order) --------
            obj.meth1();             // calls non-static method → prints "from non-static method"
            meth();                  // calls static method → prints "from static method"
            ClassLoading.meth();     // another way to call the same static method

            // -------- Step 5 (end of main) --------
            System.out.println("end of main");
        }

        // Another static block (part of Step 1, runs after static block1)
        static {
            System.out.println("from static block2");
        }
    }



//


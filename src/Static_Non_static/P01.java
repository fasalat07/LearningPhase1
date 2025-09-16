package Static_Non_static;

public class P01 {

        // non-static field (instance variable)
        int number = 10;

        // non-static method
        void nonStaticGreet() {
            System.out.println("Hello from NON-STATIC method! Number = " + number);
        }

        // static method with parameter
        static void staticGreet(P01 obj) {
            System.out.println("Inside staticGreet...");

            // obj is a local variable here, but it points to the same object in the main methos
            obj.nonStaticGreet();

            // modify the object's field using obj
            obj.number = 99;
            System.out.println("Value of number changed inside staticGreet to: " + obj.number);
        }

        static void greet2(){
            System.out.println("Inside greet2");
            P01 greet2 = new P01();
            greet2.nonStaticGreet();
            System.out.println(" calling from greet2 method"+greet2.number);
            greet2.number=30;
            System.out.println("update the value from to 30 using greet2 object"+greet2.number);

        }

        // main method
        public static void main(String[] args) {
            System.out.println("Inside main...");

            // create object
            P01 mainObj = new P01();

            // call non-static method using mainObj
            mainObj.nonStaticGreet();


            //call the method and  pass the object to staticGreet so that it can use it as an a parameter can be any type: primitive or reference (object).
            staticGreet(mainObj);

            greet2();
            // call the second static method

            // print again in main to show change reflects here too
            System.out.println("Back in main, number = " + mainObj.number);
        }
    }



package Class;

public class ClassLoading {


        static //static block
        {
            System.out.println("from static block1");
        }

    ClassLoading()
        {
            System.out.println("from constructor");
        }

        static int i=10; //static variable

        int j=20; //non-static variable


        //non-static block
        {
            System.out.println("from non static block");
        }

        public static void meth() //static method
        {
            System.out.println("from static method");
        }

        public void meth1() //non-static method
        {
            System.out.println("from non-static method");
        }


        public static void main(String[] args) {
            //1st line of the main method.
            System.out.println("program started");
            System.out.println("1st line of main method");

            ClassLoading obj = new ClassLoading(); //object creation

            obj.meth1();

            meth();
            ClassLoading.meth();
            System.out.println("end of main");
        }


        static //static block
        {
            System.out.println("from static block2");
        }
    }



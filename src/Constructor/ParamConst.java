package Constructor;

public class ParamConst {


        // Instance variables (fields of the class)
        String name;
        int eyes;
        int hands;
        int legs;
        int nose;


        ParamConst(String name, int eyes, int hands, int legs, int nose) {
            this.name = name;   // "this.name" = instance variable, "name" = parameter
            this.eyes = eyes;
            this.hands = hands;
            this.legs = legs;
            this.nose = nose;
        }


        ParamConst(String name, int eyes, int hands, int legs) {
            this.name = name;
            this.eyes = eyes;
            this.hands = hands;
            this.legs = legs;

        }

        ParamConst(String name) {
            this.name = name;
            this.eyes = 2;   // default values as we can  assign directly
            //These are instance variables — they belong to each object created from this class.
            //Even if they are not passed as parameters, you can still set them inside the constructor (or anywhere in the class).
            //If you don’t pass values → you can assign default values.

        }

        // Method to print all values
        void showDetails() {
            System.out.println("Name: " + name + ", Eyes: " + eyes + ", Hands: " + hands + ", Legs: " + legs + ", Nose: " + nose);
            //showDetails() works without parameters because it uses the object's
            // instance variables (name, eyes, hands, legs, nose).
            // When we create an object with constructor values, those values are stored
            // inside the object.
            // Any method inside the class can directly use them, so we don’t need
            // to pass them again as arguments.
        }


        public static void main(String[] args) {

            // Using constructor with 5 parameters
            ParamConst obj = new ParamConst("Test 1", 2, 2, 2, 1);
            obj.showDetails();

            // Using constructor with 4 parameters
            ParamConst obj1 = new ParamConst("Test 2", 2, 2, 2);
            obj1.showDetails();

            // Using constructor with only 1 parameter
            ParamConst obj2 = new ParamConst("Test 3");
            obj2.showDetails();
        }
    }



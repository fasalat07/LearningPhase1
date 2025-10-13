package PolyMorphism;

public class DynamicMethodDispatch_Child extends DynamicMethodDispatch_Parent {


    // Overriding the sound() method of parent class
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {


        // Case 1: Parent reference and Parent object
        // Here both reference and object are of the same type
        DynamicMethodDispatch_Parent a1 = new DynamicMethodDispatch_Parent();
        a1.sound();  // Output: Animal makes a sound
        // Explanation: Since a1 is an Animal type and object is also Animal,
        // compiler and JVM both call Animal's version of sound().

        // Case 2: Parent reference and Child object
        // This is where Dynamic Dispatch happens
        DynamicMethodDispatch_Parent a2 = new DynamicMethodDispatch_Child();
        a2.sound();  // Output: Dog barks
        // Explanation: Reference type is Animal, but actual object is Dog.
        // The call to sound() is resolved at runtime,
        // and Dog's version of sound() is executed.

        // Case 3: Child reference and Child object
        DynamicMethodDispatch_Child d1 = new DynamicMethodDispatch_Child();
        d1.sound();  // Output: Dog barks
        // Explanation: Both reference and object are of Dog type,
        // so Dog's sound() method is called directly.

        // Final Output will be:
        // Animal makes a sound
        // Dog barks
        // Dog barks
    }
}



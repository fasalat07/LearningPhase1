package PolyMorphism;

//Definition:
//Dynamic Method Dispatch (also called Runtime Polymorphism)
//is a mechanism by which a call to an overridden method is
//resolved at runtime rather than compile time.
//
//In simple words:
//When a parent class reference variable refers to a child class object,
//        and both have the same method (overridden), the method of the
//child class is executed — this is decided at runtime.



public class DynamicMethodDispatch_Parent {

    // Method in parent class
    void sound() {
        System.out.println("Animal makes a sound");
    }

}

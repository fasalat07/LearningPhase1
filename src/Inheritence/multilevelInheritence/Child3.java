package Inheritence.multilevelInheritence;

public class Child3 extends Child2{

    int d = 40;

    public static void main(String[] args) {
        Child3 obj=new Child3();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
    }

}

//Inheritance = one class (child) can use the fields and methods of another class (parent).
//Multilevel Inheritance means:
//A class is derived from another class, and then another class is derived from it.
//It forms a chain of inheritance.
//multilevel inheritance is allowed (chain of classes).
///


// Base class (Grandparent)
//class Animal {
//    void eat() {
//        System.out.println("I can eat");
//    }
//}
//
/// / Derived class (Parent)
//class Dog extends Animal {
//    void bark() {
//        System.out.println("I can bark");
//    }
//}
//
//// Derived class (Child)
//class Puppy extends Dog {
//    void weep() {
//        System.out.println("I can weep");
//    }
//}
//
//public class MultiLevelInheritanceDemo {
//    public static void main(String[] args) {
//        Puppy p = new Puppy();
//
//        // Methods from all levels of inheritance
//        p.eat();   // From Animal
//        p.bark();  // From Dog
//        p.weep();  // From Puppy
//    }
//}
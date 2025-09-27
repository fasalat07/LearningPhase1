package Inheritence.SingleLevelInheritence;

public class This_and_Super_Child extends This_and_Super_Parent {
    String name = "Child Variable";
    int age = 2;

    void display() {
        System.out.println("Child variable (using this): " + this.name);
        System.out.println("Parent variable (using super): " + super.name);
        System.out.println("Parent's age is " +super.age);
    }

    public static void main(String[] args) {
         This_and_Super_Child obj = new This_and_Super_Child();
         obj.display();
    }
    }



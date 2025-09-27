package Constructor;
//Write a program which has default const,
// 1 param const
//multi param constructor and use those constructor by creating objects


public class MultiParamConstructor {

    int age = 10;

    // Default constructor
    MultiParamConstructor (){
        System.out.println("Default constructor loaded, age = " + age);
    }

    // Parameterized constructor
    MultiParamConstructor (int age){
        this.age = age;
        System.out.println("Parameterized constructor loaded, age = " + this.age);
    }

    public static void main(String[] args) {
        // Calls default constructor
        MultiParamConstructor obj1 = new MultiParamConstructor();

        // Calls parameterized constructor
        MultiParamConstructor obj2 = new MultiParamConstructor(25);
    }
}

/*
 Explanation of this.age = age;

 1) int age = 10; → This is the instance variable (belongs to the object).
 2) In the constructor MultiParamConstructor(int age),
    the parameter "age" is a local variable (only exists inside the constructor).
 3) Since both have the same name, "age" inside the constructor
    refers to the parameter, not the instance variable.
 4) "this.age" specifically refers to the instance variable of the current object.
 5) So when we write: this.age = age;
       - Left side (this.age) → the instance variable (initially 10).
       - Right side (age) → the parameter passed into the constructor.
 6) Example:
       MultiParamConstructor obj = new MultiParamConstructor(20);
       - Before constructor runs: instance variable age = 10
       - Parameter age = 20
       - this.age = age → instance variable (10) is updated with parameter (20)
       - Final value of instance variable age = 20
*/

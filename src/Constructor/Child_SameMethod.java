package Constructor;

public class Child_SameMethod extends Parent_SameMethord {

    Child_SameMethod(){
        System.out.println( "Child Default constructor" );

    }


    void display() {                                      // [Step 5] Store overridden method display() in Child
        System.out.println("Display method from Child"); // [Step 6] Method code stored
    }

    void showBoth() {                         // [Step 7] Store showBoth() in Child
        this.display();                       // [Step 8] Call Child’s own display()
        // → jumps to Child.display()
        // → prints "Display method from Child"
        super.display();                      // [Step 9] Call Parent’s display()
        // → jumps to Parent.display()
        // → prints "Display method from Parent"
    }

    public static void main(String[] args) {  // [Step 10] Program entry point
        Child_SameMethod obj = new Child_SameMethod();              // [Step 11] Create Child object
        // → Calls default constructor of Child
        // → Parent’s constructor runs first automatically (inherited)
        obj.showBoth();                       // [Step 12] Call showBoth() method of Child
        // → Executes step [8] then [9]
    }
}

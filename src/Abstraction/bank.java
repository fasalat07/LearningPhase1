package Abstraction;

public abstract class bank {

    abstract void rateOfInterest();
    // abstarct method cannot have a body
    // Abstract method -> declared but not implemented
    // Each bank will have its own rate of interest, so we leave it abstract

    // (normal) method -> has a body (implementation)
    void bankPolicy() {
        System.out.println("All banks must follow RBI guidelines.");
    }

    bank() {
        System.out.println("Bank object created.");
        // Constructor -> Yes, abstract classes can have constructors
        // This will run when a subclass object is created
    }

    //  Not allowed — you cannot create an object of abstract class
    // Bank b = new Bank();
}

package Abstraction;

public class Sbi extends bank{

    @Override
    void rateOfInterest() {
        System.out.println("SBI Rate of Interest: 6.5%");

    }

    public static void main(String[] args) {


        bank sbi = new Sbi();
        //  Allowed — create object of subclass (SBI)
        // When SBI object is created, first Bank constructor runs

        // Calling the concrete method from abstract class
        sbi.bankPolicy(); // Output: All banks must follow RBI guidelines.


        // Calling the overridden abstract method from SBI
        sbi.rateOfInterest(); // Output: SBI Rate of Interest: 6.5%

    }
}

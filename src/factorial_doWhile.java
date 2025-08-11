
//Write a program using loop - Find Factorial number (use for loop, while and do while loop)

public class factorial_doWhile {
    public static void main(String[] args) {

        int num= 8;   // the number to find the factorial for it
        int factorial= 1; // to store te complete factorial result
        int i=1; // initialization

        do{
            factorial = factorial*i; // logic
            i++; // updation
        }
        while (i<=num); // condition
        System.out.println(factorial);

    }
}



















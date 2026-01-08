package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadIntegerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for user input

        try {
            System.out.print("Enter an integer: ");
            int number = sc.nextInt(); // Tries to read an integer from user
            System.out.println("You entered: " + number);
        }
        catch (InputMismatchException e) {
            // This block executes if user enters non-integer input
            System.out.println("Error: Please enter a valid integer!");
        }
        finally {
            sc.close(); // Close scanner to free resources
            System.out.println("Program ended.");
        }
    }
}

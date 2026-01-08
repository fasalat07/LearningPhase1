package ExceptionHandling;

import java.util.Scanner;

public class ParseIntegerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.print("Enter a number as a string: ");
        String input = sc.nextLine();  // Read input as string

        try {
            // Try to convert (parse) the string into an integer
            int number = Integer.parseInt(input);

            // If successful, print the number
            System.out.println("Parsed integer value: " + number);
        }
        catch (NumberFormatException e) {
            // Handle case when input is not a valid integer
            System.out.println("Error: The entered value is not a valid integer.");
        }

        // Program continues even after exception
        System.out.println("Program ended successfully.");
        sc.close();
    }
}

package ExceptionHandling;

// When you’re working with arrays whose index values might come from user input.
//Example: A user might enter index 6 when the array has only 5 elements.
//
// When you’re performing loops or calculations that might accidentally go outside array bounds.
//Example: Accessing arr[i+1] in a loop — if i reaches the last index, it may go out of range.
//
//To make your program robust and user-friendly instead of showing a crash message like:


import java.util.Scanner;

public class ArrayExample {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // Create an array of 5 integers
            int[] numbers = {10, 20, 30, 40, 50};

            // Ask user which index they want to access
            System.out.print("Enter the index to access (0–4): ");
            int index = sc.nextInt();

            try {
                // Try to access the value at that index
                System.out.println("Value at index " + index + " = " + numbers[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                // Handle invalid index gracefully
                System.out.println("Error: Invalid index! Please enter a value between 0 and 4.");
            }

            // Continue program normally
            System.out.println("Program ended successfully.");
            sc.close();
        }
    }



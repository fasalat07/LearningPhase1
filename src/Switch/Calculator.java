package Switch;

import java.util.Scanner;

public class Calculator {

        public static void main(String[] args) {

            // Create a Scanner object for reading user input
            // Create a Scanner object called 'sc' that reads input from the keyboard (System.in)
            // Scanner is a built-in Java class in the java.util package
            // 'new Scanner(System.in)' means we are telling the program:
            // → "Take input from the console (keyboard)"
            // With this object, we can use methods like nextInt(), nextDouble(), nextLine(), etc.
            Scanner sc = new Scanner(System.in);

            // Ask user for the first number
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();
            //nextDouble(), the program will pause and wait until the user types something into the console and presses Enter.
            // Ask user to enter a number (like 10, 5.5, 3.14159)
            // Numbers can include decimals, so we store them in a 'double' type
            // sc.nextDouble() is specifically designed to read a numeric value from user input

            // Ask user for the operator
            System.out.print("Enter operator (+, -, *, /): ");
            char op = sc.next().charAt(0);

              // Ask user to enter an operator symbol (+, -, *, or /)
              // Operators are not numbers, they are single characters, so we use 'char'
              // Note: Scanner does not have a nextChar() method
              // sc.next() → reads the next input as a String (like "+" or "*")
              // .charAt(0) → extracts the first character of that String
              // Example: if user types "+", then .charAt(0) returns '+'

            // Ask user for the second number
            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            // Variable to hold the result
            double result = 0;
            boolean ok = true; // Flag to track if calculation is valid

            // Switch statement to perform operation

            switch (op) {
                // Why switch(op)?
                // In our calculator program, the decision (which math operation to perform)
                // depends on the operator the user typed: +, -, *, /
                // That operator is stored in the variable 'op' (a char).// So we use switch(op) → it means:
                //   "Check the value inside 'op' and choose the correct case."
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    if (b == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                        ok = false;
                    } else {
                        result = a / b;
                    }
                    break;
                default:
                    System.out.println("select the coorect operator '" + op + "'.");
                    ok = false;
            }

            // Print result only if calculation is valid
            if (ok) {
                System.out.println("Result: " + result);
            }

            // Close the scanner
            sc.close();
        }
    }



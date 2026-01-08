package ExceptionHandling;

public class MultipleExceptionExample {

    public static void main(String[] args) {

        try {
            // Example 1: ArithmeticException
            int result = 10 / 0; // dividing by zero

            // Example 2: NumberFormatException
            int num = Integer.parseInt("abc"); // invalid number string

            // Example 3: NullPointerException
            String str = null;
            System.out.println(str.length()); // calling method on null
        }

        // Catch specific exceptions one by one
        catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        }
        catch (NullPointerException e) {
            System.out.println("Error: Null value encountered.");
        }
        catch (Exception e) {
            System.out.println("Some other error occurred: " + e.getMessage());
        }

        System.out.println("Program continues after handling exceptions.");
    }
}

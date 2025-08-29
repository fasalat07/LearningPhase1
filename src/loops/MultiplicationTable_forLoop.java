package loops;

//for loop : Print a multiplication table from 1 to 10, but stop printing entirely when any result is divisible by 7 and greater than 30. Use a labeled break.

public class MultiplicationTable_forLoop {

    public static void main(String[] args) {

        System.out.println("Multiplication Table (1 to 10):\n");

        // Outer loop → rows
        for (int i = 1; i <= 10; i++) {
            // Inner loop → columns
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", (i * j)); // formatted with spacing
            }
            System.out.println(); // new line after each row
        }


    }

}



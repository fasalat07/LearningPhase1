package loops;

// While loop : Print a multiplication table from 1 to 10,
// but stop printing entirely when any result is divisible by 7
// and greater than 30. Use a labeled break.

public class MultiplicationTable_DoWhile {

    public static void main(String[] args) {

        // Print heading for clarity
        System.out.println("Multiplication Table (1 to 10):\nUsing do-while loop\n");

        int i = 1; // Outer loop counter (row index)

         outer:
         // Outer loop → controls rows
        do {
            int j = 1; // Inner loop counter (column index)

            // Inner loop → controls columns
            do {
                int multiplication = i * j;             // compute product
                System.out.printf("%4d", multiplication);// print product formatted in 4 spaces
                if(multiplication % 7 == 0 && multiplication>30)
                    break outer;

                j++;                                    // move to next column
            } while (j <= 10); // inner loop ends after printing 1 row

            System.out.println(); // move to the next line (new row)
            i++;                  // increment outer loop counter (row)

        } while (i <= 10); // outer loop runs until i = 10
    }
}

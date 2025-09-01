package loops;

public class MultiplicationTable_whileLoop {
    // While loop : Print a multiplication table from 1 to 10,
    // but stop printing entirely when any result is divisible by 7
    // and greater than 30. Use a labeled break.

    public static void main(String[] args) {
        System.out.println("Multiplication Table (1 to 10):\nUsing while loop\n");

        int i = 1; // outer loop counter

        outerloop: // label for the outer loop
        while (i <= 10) { // outer loop → rows

            int j = 1; // reset inner loop counter for each row

            while (j <= 10) { // inner loop → columns
                int multiplication = i * j;

                if (multiplication % 7 == 0 && multiplication > 30) {
                    break outerloop; // stop both loops entirely
                }

                System.out.printf("%4d", multiplication); // print formatted value
                j++;
            }

            System.out.println(); // move to the next row
            i++;
        }
    }
}

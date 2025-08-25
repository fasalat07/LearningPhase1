public class fibinocci_While_loop {

    public static void main(String[] args) {

        //Each number is the sum of the two numbers before it. and it starts with 0 and 1  example 1,2,3,5,8

        // Main method - program execution starts here

        int first = 0;    // First number of the Fibonacci series
        int second = 1;   // Second number of the Fibonacci series
        int num = 10;     // How many Fibonacci numbers we want to print
        int count = 2;    // Counter starts at 2 because we already have the first two numbers

        System.out.print(first + " " + second);   // Print the first two Fibonacci numbers

        while (count < num) {    // Loop runs until we print 'num' numbers
            int sum = first + second;    // Next number is the sum of the previous two
            System.out.print(" " + sum); // Print the next Fibonacci number

            first = second;    // Move 'second' into 'first' (shift for next step)
            second = sum;      // Move 'sum' into 'second' (shift for next step)

            count++;   // Increase the counter so loop moves closer to stopping
        }
    }

}

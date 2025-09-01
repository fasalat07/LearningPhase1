package loops;

//for loop : Print a multiplication table from 1 to 10, but stop printing entirely when any result is divisible by 7 and greater than 30. Use a labeled break.

public class MultiplicationTable_forLoop {

    public static void main(String[] args) {

        System.out.println("Multiplication Table (1 to 10):\n");

        outerloop : //  // label for the outer loop
        for (int i = 1; i <= 10; i++) { // This will iterate from 1 to 10
            // Inner loop → columns
            for (int j = 1; j <= 10; j++) { // here the inner loop will multiply each number of outerloop from 1 to 10
                int multiplication = i*j;
                if(multiplication % 7 ==0 && multiplication>30){
                    break outerloop;
                }
                System.out.printf("%4d",multiplication ); // formatted with spacing while multiplying each outerloop number with innerloop
                //%d → print an integer.
                //4 → minimum width = 4 characters.
                //If the number has fewer digits, it gets left-padded with spaces so that all numbers line up in neat columns.

            }
            System.out.println(); // new line after each row
        }


    }

}



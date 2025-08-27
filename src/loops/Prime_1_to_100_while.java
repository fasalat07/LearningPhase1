package loops;

public class Prime_1_to_100_while {

    public static void main(String[] args) {

        int num = 1;   // start from 1 because we can divide with zero

        while (num <= 100) {  // iteration from 1 to 100

            int prime = 0;   // reset factor count for each num
            int i = 1;       // reset divisor counter for each num

            // check factors of num
            while (i <= num) {
                if (num % i == 0) {
                    prime++;
                }
                i++;
            }

            // check prime condition
            if (prime == 2) {
                System.out.println(num + " is a prime number");
            }

            num++;  // move to next number
        }
    }
}


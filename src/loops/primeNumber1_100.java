package loops;

public class primeNumber1_100 {

    // A prime number is a whole number greater than 1 that has only two factors: 1 and itself.

    public static void main(String[] args) {

        int prime = 0;  // variable to count the number of factors

        // Loop through numbers from 1 to 100
        for (int num = 1; num <= 100; num++) {

            // Check how many numbers divide 'num' completely
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {   // if remainder is 0, then 'i' is a factor of 'num'
                    prime++;          // increase the factor count
                }
            }

            // If 'num' has exactly 2 factors (1 and itself), then it is prime
            if (prime == 2) {
                System.out.println(num + " is a prime number");
            }

            prime = 0; // reset factor count for the next number

        }



    }
}

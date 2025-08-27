package loops;

public class Prime_do_while_100 {   // Class name must match file name

    public static void main(String[] args) {   // Main method - entry point of Java program

        int num = 1;   // Start checking from number 1

        do {   // Outer loop to go through numbers from 1 to 100

            int i = 1;       // 'i' will be used as divisor to check factors of num
            int prime = 0;   // Counter to count how many divisors num has

            // Inner loop: check all divisors from 1 up to num
            do {
                if (num % i == 0) {   // If num is divisible by i without remainder
                    prime++;          // Increase divisor count
                }
                i++;   // Move to next divisor
            } while (i <= num);   // Continue checking until i becomes greater than num

            // After inner loop ends, check if number is prime
            if (prime == 2) {   // A prime number has exactly 2 divisors: 1 and itself
                System.out.println(num + " is a prime number");
            }

            num++;   // Move to next number to test in outer loop

        } while (num <= 100);   // Repeat until num reaches 100

    }   // End of main method
}   // End of class

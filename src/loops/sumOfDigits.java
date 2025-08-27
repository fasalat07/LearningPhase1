package loops;

public class sumOfDigits {

    public static void main(String[] args) {

        int num = 527; // fixed number
        int sum = 0;

        for (int i = num; i > 0; i=i/ 10) { //  the condition i=i/10 will remove the last digit from for loop

            int digit = i % 10; // extract last digit
            sum += digit;       // add to sum
        }

        System.out.println("Sum of digits of " + num + " = " + sum);
       // return 0;
    }
}

// Real/decimal math: 527 ÷ 10 = 52.7
// Integer division (Java, with int/long): 527 / 10 gives 52 (the .7 is truncated). This is exactly what you want for “remove last digit”.
// Sum-of-digits logic:
// Last digit: num % 10 → 7
// Remove last digit: num = num / 10 → 52 (integer division)
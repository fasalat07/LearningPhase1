package loops;

public class sumOfDigitsWhile {

    public static void main(String[] args) {


        int num = 570;   // number to process
        int sum = 0;     // to store sum of digits

        while (num > 0) {            // loop until num becomes 0
            int digit = num % 10;    // get last digit
            sum = sum + digit;       // add last digit to sum
            num = num / 10;          // remove last digit
        }
        System.out.println(sum);
    }
}

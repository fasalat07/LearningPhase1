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


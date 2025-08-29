package loops;

// else-if ladder
// Program: Fizz-Buzz range from 1-50
// when the number is divisible by 2 --> print "Fizz"
// when the number is divisible by 5 --> print "Buzz"
// when the number is divisible by 2 & 5 --> "FizzBuzz"
// for remaining numbers print the "number"

public class fIzzBuzz {
    public static void main(String[] args) {

        int number = 50;

        for (int i = 1; i <= number; i++) {

            if (i % 2 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 2 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}

package Method;

//A palindrome number in Java (or in general) is a number that remains the same when its digits are reversed.
// Examples:
//121 → reversed is 121 (Palindrome )
//12321 → reversed is 12321 (Palindrome )
//123 → reversed is 321 (Not a palindrome )

public class Palindrome {
    public static void main(String[] args) {

        int ogNumber = 121;
        int revNumber = 0;
        int digit = 0;
        System.out.println("Original Number is " + ogNumber);

        for (int i = ogNumber; i > 0; i = i / 10) {

            digit = i % 10;
            revNumber = revNumber * 10 + digit;
        }
        if (ogNumber == revNumber) {
            System.out.println(revNumber + " is paliandrom");
        } else
            System.out.println(revNumber + " is not a paliandrom");

    }
}

package loops;

// Armstrong number:
// A number that equals the sum of its own digits,
// each raised to the power of the total number of digits.
//
// Example: 153
// Digits = 3 → (1*3 + 5*3 + 3*3) = (3 + 125 + 27) = 153 → Armstrong number

public class Armstrong {

    public static void main(String[] args) {

        // Step 1: Define the number to check
        int number = 153;

        // Step 2: Find how many digits are present in the number
        int digits = 0;
        for (int i = number; i > 0; i = i / 10) {
            digits++;   // Keep counting digits by dividing by 10
        }
        // Example: 153 → 3 digits

        // Step 3: Calculate the sum of each digit raised to 'digits' power
        int sum = 0;
        for (int i = number; i > 0; i = i / 10) {
            int digit = i % 10;   // Extract last digit (e.g., 153 % 10 = 3)

            int power = 1;
            for (int j = 0; j < digits; j++) {
                power = power * digit;  // Multiply digit by itself 'digits' times
            }
            sum = sum + power;   // Add powered value to sum  finally it should add the sum of all the multiplications
        }

        // Step 4: Compare sum with original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is NOT an Armstrong number");
        }
    }
}

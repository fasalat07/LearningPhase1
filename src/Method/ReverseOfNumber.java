package Method;


// program to reverse the given number input=14578 , output=87541 using logic inside method
//379

public class ReverseOfNumber {

    public static void main(String[] args) {
        System.out.println(getReverse(379));

    }

    public static int getReverse(int number)
    {
        int reverse = 0;
        int digit = 0;
        for (int i = number ; i>0 ; i= i / 10){
            digit = i % 10;
            reverse = reverse * 10 + digit;
            // here the logic is we need find space to shoft the number to left
            // reverse = 0 inf irst case
            // digit = 9
            // so reverse will be 0*10+9 = 9 so we got first number amnd now in the second itration we need to shidt the next number to the right  of 9 which is only possible with multiplying
            // the current number with 10 so we get postion of 0 and when we add the digit with that it wil occuppy the space of zero
            // second iteration will get 7
            // reverse is already 9*10+7 = 90 + 7 = 97
            // Third iteration
            // 97 *10 = 970 +3 = 973

        }
        return reverse;
    }
}

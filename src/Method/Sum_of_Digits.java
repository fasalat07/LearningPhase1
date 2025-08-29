package Method;

//Java program to calculate the sum of digits of
//a number


public class Sum_of_Digits {

    public static void main(String[] args) {

        int number = 555;
        int result = getSum(number);
        System.out.println("sum of digit is" +" "+result);

    }

    public static int getSum(int number){
        int sum = 0;
        int digit = 0;
        for(int i = number; i>0; i = i /10){
            digit = i % 10;
            sum= sum + digit;
        }
        return sum;

    }
}

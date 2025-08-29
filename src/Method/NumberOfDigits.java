package Method;

// program to find the number of digits in a given number 14578

public class NumberOfDigits {

    public static void main(String[] args) {

      int result = getDigitCount(1234567);
        System.out.println(" number of digits = "+"" + result);

    }


    public static int getDigitCount ( int number){

        int digits =0;
        for (int i = number; i>0; i= i /10 ){
            digits ++;
        }
        return digits;

    }

}

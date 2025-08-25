public class sumOfDigits_Do_while {

    public static void main(String[] args) {

        int num = 111;
        int  sum = 0;

        do {
            int digit = num % 10;
            sum = sum + digit ;
            num = num /10;


        } while(num>0);
        System.out.println(sum);
    }
}

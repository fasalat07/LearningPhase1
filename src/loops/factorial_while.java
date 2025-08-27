package loops;

public class factorial_while {
    public static void main(String[] args) {

        int num =7;
        int factorial= 1;

        int i=1;
        while (i <= num )
        {
           factorial = factorial * i;
           i++;

        }

        System.out.println(factorial);
    }
}

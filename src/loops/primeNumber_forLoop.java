package loops;

//check for prime number for a specefic number
public class primeNumber_forLoop {

    public static void main(String[] args) {
        // prime number is a number greater than 1 that has no divisors other than 1 and itself.

        int num = 2; // This the number we are finding for prime or not
        int prime = 0;

        for(int i=1;i<=num ;i++ ){

            if(num%i==0){
               prime++; // prime =prime+1

            }
        }

        if(prime==2)

        {
            System.out.println("the number is prime");
        }
        else{

            System.out.println(" Number is not prime");
        }
    }

}
package Method;

//Java program to Find Odd or Even number from 1 to 50

public class Odd_Even {

    public static void main(String[] args) {
        getOdd_Even(50);

    }

    public static void getOdd_Even(int number){

        for (int i = 1; i<=number; i++){

            if(i % 2 == 0){
                System.out.println( i + " is even number");
            } else
                System.out.println(i + " is odd number");
        }


    }

}

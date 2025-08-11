public class primeNumber1_100 {



    public static void main(String[] args) {

        int prime = 0;

        for(int num=1; num <= 100; num ++){   // it will pass the number from 1 to 100

            for(int i=1; i<=num; i++){

             if (num % i ==0){
                 prime++;
             }

            }
            if(prime==2){

                System.out.println(+num+"  "+   "the number is prime");
            }

             prime=0;

        }



    }
}

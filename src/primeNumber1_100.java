public class primeNumber1_100 {



    public static void main(String[] args) {

        int prime = 0;

        for(int num=1; num <= 100; num ++){   // it will pass the number from 1 to 100

            for(int i=1; i<=num; i++){ // it will iterate from 1 to 100 for perfroming below logic for eac number

             if (num % i ==0){  // this will divide the number starting from 1 to 100 and compare if the reminder is equal to zero
                 prime++;  //if the reminder equal to zero then it will increase prime
             }

            }
            if(prime==2){  // Ideally prime number is something which can be divisible by itself and one so  if it is prime equals to zero

                System.out.println(+num+"  "+   "the number is prime");
            }

             prime=0;    // prime needs to be again zero else it will fail the above condition

        }



    }
}

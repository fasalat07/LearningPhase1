public class fibinocciSeries {
    public static void main(String[] args) {

        // what is fibinocci series ?
        //Each number is the sum of the two numbers before it. and it starts with 0 and 1


        int num= 10;                   // till where to find fibinocci series
        int first = 0;                 // first number in the fibinocci series is always 0 to start with
        int second = 1;                // second number in the fibinocci series is always 1

        for(int i=0;i<num;i++ ){         // here we are iterating from 1 to 10

            int sum = first + second ;    // adding the first two numbers and saving it
            first = second;               // first will move from 0 to 1
            second = sum;                 // Now what ever the sum was it will be moved to the second number here it will be still 1 and it keeps shifting till the loop
            System.out.println(second);


        }

    }
}
// when i=2
//sum = first + second
//sum = 1 + 1 = 2
//first = second
//first = 1    first becomes the old second (1)
//second = next
//second = 2   second becomes the new calculated value (2)


// when i =3
//sum = first + second
// sum = 1 + 2 = 3
//first = second
// first = 2   // First becomes old second
//second = next
//second = 3  // Second becomes the new calculated value

//basically in summ all this will be added like 1+2+3 so now after 3 itration the sum will be 5
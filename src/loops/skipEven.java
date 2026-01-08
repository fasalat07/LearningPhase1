package loops;

//Java program that prints numbers from 1 to 20, skipping the even ones:

public class skipEven {
    public static void main(String[] args) {

        for (int i = 1; i<=20; i++){

            if (i % 2 == 0){
                continue; // skip even numbers
            }
            System.out.println(i);
        }

    }
}

package Array;

public class array_01 {


        public static void main(String[] args) {
            //primitive type of init and decl
            int a = 10;
            a = 20;
            a = 30;
            a = 40;
            System.out.println(a);

            //syntax1:
            int[] a1 = {10,20,30,40};

            //syntax2:
            int a2[] = {5,10,50,20,30,40};

            //syntax3:
            int[] a3 = new int[5]; //5 is size or length.

            //index will always start from 0

            //first elemnt
            System.out.println(a2[0]);
            System.out.println("==================");

            //last element ---> length/size will start from 1
            System.out.println(a2[a2.length-1]);
            System.out.println("==================");

            //how to read the data from array using simple for
            for (int index=0 ;index<a2.length ; index++)
            {
                System.out.println(a2[index]);
            }
            System.out.println("==================");

            //how to read the data from array using  for each
            for (int x : a2 )
            {
                System.out.println(x);
            }

            System.out.println("==================");

            //how to write data into an array simple for loop
            int[] a4 = new int[5]; //{10,11,12,13,14}
            int count = 10;
            for (int index=0 ; index<a4.length ; index++)
            {
                a4[index] = count++;
                System.out.println(a4[index]);
            }
            System.out.println("==================");

            //how to write data into an array for each loop
            int[] a5 = new int[3]; // {5,6,7}
            int c = 5;
            int i = 0;
            for (int y : a5)
            {
                int value = a5[i++] = c++;
                System.out.println(value);
            }
            System.out.println("==================");

        }
    }


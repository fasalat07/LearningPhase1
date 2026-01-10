package Assignments;

//Sort an array = {4,8,33,6,9,42,121,6,7} with inbuilt method and without inbuilt method
public class Array_Sorting {

    public static void main(String[] args) {

        int[] arr = {4, 8, 33, 6, 9, 42, 121, 6, 7};

        //Arrays.sort(arr);

        // Print sorted array
        // why to convert to string ? arrays do NOT print their values directly in Java. and arr is an object reference.
        // object stores primitive int values so we need to convert to readable format
        // System.out.println("sort array using inbuilt method " + Arrays.toString(arr));
        System.out.println("length of array " + arr.length);

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) { // here we are just collecting index number to compare

                if (arr[j] < arr[i]) {


                    int temp = arr[i];  // store original value
                    arr[i] = arr[j];    // move smaller value left
                    arr[j] = temp;      // move bigger value right

                }

            }

            for (int num : arr) {

                System.out.println(num);
            }
        }
    }
}

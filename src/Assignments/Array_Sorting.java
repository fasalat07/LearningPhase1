package Assignments;

import java.util.Arrays;

//Sort an array = {4,8,33,6,9,42,121,6,7} with inbuilt method and without inbuilt method
public class Array_Sorting {

    public  static void main (String[] args){

        int [] arr = {4,8,33,6,9,42,121,6,7};

        Arrays.sort(arr);

        // Print sorted array
        // why to convert to string ? arrays do NOT print their values directly in Java. and arr is an object reference.
        // object stores primitive int values so we need to convert to readable format
        System.out.println(Arrays.toString(arr));

    }

}

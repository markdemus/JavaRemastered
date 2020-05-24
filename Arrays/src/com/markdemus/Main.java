package com.markdemus;

import java.util.Scanner;

public class Main {

    //OR
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        initializing the array this way
//        int[] myIntArray = new int[5]; assigning the array with 10 values OR
//        myIntArray[0] = 50;
//        myIntArray[1] = 50;
//        myIntArray[2] = 50;
//        myIntArray[3] = 50;
//        myIntArray[4] = 50;
//        myIntArray[5] = 50; // assigning the 6th spot to be 50 starting at 0
//
//        //OR
//        //int[] myIntArray = {0,1,2,4,5,6};
//
//        //OR
//        int[] myIntArray = new int[10]; //1,2,3,4,5
//        for(int i = 0; i < myIntArray.length; i++) { //setting for loop to set the entire array according to the condition
//            myIntArray[i] = i * 10; //starting at 0, assigning the value of i * 10 ++. Could use a method instead where 10 is. Like .length for the entire length of the array
//        }
//        for(int i = 0; i < myIntArray.length; i++) {
//            System.out.println("Element " + i + ", value is " + myIntArray[i]);
//        }
//
//        //System.out.println(myIntArray[5]); //printing out the 5th value from above
//
//        //OR
//        printArray(myIntArray);

        int[] myIntegers = getIntegers(5); //defining/storing the numbers method
        for(int i  = 0; i <myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }

        System.out.println("The average is " +getAverage(myIntegers));

    }

    public static int[] getIntegers(int number) { //passing to the myIntegers method
        System.out.println("Enter " + number + " integer values.\r"); //allows us to type in 5 numbers
        int[] values = new int[number];

        for(int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt(); //automatically accepts an integer to store in array
        }
        return values; //returns array
    }

    //Method to return avg. of array
    public static double getAverage(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i]; //adding to it and overwriting
        }
        return ((double) sum / (double)array.length );
    }
//
//    public static void printArray(int[] array) {
//        for(int i = 0; i < array.length; i++) {
//            System.out.println("Element " + i + ", value is " + array[i]);
//        }
//    }
}

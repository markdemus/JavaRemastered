package com.markdemus;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue " +myIntValue);
        System.out.println("anotherIntValue " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue " +myIntValue);
        System.out.println("anotherIntValue " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherIntArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " +Arrays.toString(anotherIntArray));

        anotherIntArray[0] = 1;
        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " +Arrays.toString(anotherIntArray));

        anotherIntArray = new int[]{6, 7, 8, 9};
        modifyArray(myIntArray); //passing reference type to method now we have 3; aka dereference

        System.out.println("after modified myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after modified anotherArray = " +Arrays.toString(anotherIntArray));

    }
    //using method to change position to 2
    private static void modifyArray(int[] array) {
        array[0] = 3;
        array = new int[] {1,2,3,4,5}; //reinitializing or de-referencing the reference it points to a new array now
    }
}

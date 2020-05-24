package com.markdemus;

public class DoubleFloatChallenge {
    /* Create a variable with the appropriate type to store the number of pounds to be converted to kilograms.
    Calculate the result and store it into a second variable and print out.
    1lb = .45359237 of a kg
    *
    * */

    public static void main (String[] args) {

        int myIntPounds = 200;
        double myDoubleKg = 0.45359237d;
        //or double myDoubleConverted = myIntPounds * 0.45359237d; sout(myDoubleConverted)
        double result = myIntPounds * myDoubleKg;

        System.out.println("The result of my challenge is " + result);
    }
}

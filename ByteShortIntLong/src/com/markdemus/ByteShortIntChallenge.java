package com.markdemus;

public class ByteShortIntChallenge {
    /*
    Create a byte variable and set it to any valid byte number. Same for short and int.
    Create a long and make it equal to 50000 plus 10 times the sum of the byte plus the short and integer.
    *
    */
    public static void main (String[] args) {


        byte myByteValue = 120;
        short myShortValue = 3000;
        int myIntValue = 90000;
        long myLongValue = 50000L + 10L * (myByteValue + myShortValue + myIntValue);

        System.out.println("My long value for my challenge is " + myLongValue);
    }
}

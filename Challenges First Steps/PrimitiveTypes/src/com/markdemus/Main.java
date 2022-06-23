package com.markdemus;

public class Main {

    public static void main(String[] args) {

        //Primitive Types Challenge #1
        byte myByteNum = 15;
        short myShortNum = 20;
        int myIntNum = 25;

        long myLongTotalValue = 50000L + 10 * (myByteNum + myShortNum + myIntNum);
        System.out.println(myLongTotalValue);

        //Cast into short
        short shortTotal = (short) (1000 + 10 * (myByteNum + myShortNum + myIntNum));
        System.out.println(shortTotal);

        //Cast to remove error from: float myFloatValue = 5.25; that's looking for a double Challenge #2
        int myIntValue = 5;
        float myFloatValue = (float) 5.25; //result, though not recommended as a data type all together nowadays
        double myDouble = 5.25;
        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDouble);

        //Convert Pounds to kilograms Challenge #3
        double myPounds = 160;
        double myPoundsInKilograms = myPounds * .45359237;
        System.out.println(myPoundsInKilograms);
    }
}

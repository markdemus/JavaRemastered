package com.markdemus;

public class Main {
    /*
    Lesson 3. Primitive Types and their ranges
     */
    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + (myMinIntValue));
        System.out.println("Integer Maximum Value = " + (myMaxIntValue));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        double myDoubleValue = 100;
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum Value = " + myMaxDoubleValue);

        long bigLongLiteralValue = 2_147_483_647_234L; //int fits into long. That's why we don't get errors
        System.out.println(bigLongLiteralValue);

        int MyTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);

        //Challenge
        byte myByteNum = 15;
        short myShortNum = 20;
        int myIntNum = 25;

        long myLongTotalValue = 50000L + 10 * (myByteNum + myShortNum + myIntNum);
        System.out.println(myLongTotalValue);

        short shortTotal = (short) (1000 + 10 * (myByteNum + myShortNum + myIntNum));
    }
}

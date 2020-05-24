package com.markdemus;

public class PrimitiveTypes {

    public static void main(String[] args) {
        //int
        int myValue = 1000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum value = " + myMinIntValue); //-2147483648
        System.out.println("Integer Maximum value = " + myMaxIntValue); //2147483647
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1)); //overflow
        System.out.println("Busted MIN value = " + (myMinIntValue - 1)); //underflow

        int myMaxIntTest = 2_147_483_647;

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //byte
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum value = " + (myMinByteValue)); //-128
        System.out.println("Byte Maximum value = " + (myMaxByteValue)); //127

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //short
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum value = " + (myMinShortValue)); //-32768
        System.out.println("Short Maximum value = " + (myMaxShortValue)); //32767

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //long 2^63
        long myLongValue = 100;
        /*can convert the int of 100 without the L to a long, but in string literal terms, if
        we try to add to the variable it will warn us that integer number is too large, unless we add an L to it. See last variable below
         */

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum value = " + (myMinLongValue)); //-9223372036854775808
        System.out.println("Long Maximum value = " + (myMaxLongValue)); //9223372036854775807

        long bigLongLiteralValue = 2_147_483_647_111L;
        System.out.println(bigLongLiteralValue);

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //arithmetic & casting
        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);
        // if we know the value will fit despite the error we could tell Java
        // to Cast it; treat it as a byte. Same for short

        short myNewShortValue = (short) (myMinByteValue / 2);

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //float & double
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum value = " + (myMinFloatValue)); //1.4E-45
        System.out.println("Float Maximum value = " + (myMaxFloatValue)); //3.4028235E38

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum value = " + (myMinDoubleValue)); //4.9E-324
        System.out.println("Double Maximum value = " + (myMaxDoubleValue)); //1.7976931348623157E308

        int myIntValue = 5 / 3; // doesnt handle the remainder so it just comes out to the whole number
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;
        System.out.println("My int value = " + myIntValue);
        System.out.println("My float value = " + myFloatValue);
        System.out.println("My double value = " + myDoubleValue);

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //char&boolean
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true; //is... makes it intuitive to what we're looking for

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //String; is not a primitive type

        String myString = "This is a string";
        System.out.println("Example: " + myString);
        myString= myString + ", and this is more.";
        System.out.println("Example: " + myString);
        myString = myString + " \u00A9 2020";
        System.out.println("Example: " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95"; //will not add since we are using a text data type
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 30;
        lastString = lastString + myInt;
        System.out.println("Example: " + lastString); //converted 30 to a string and appended it to the string
        double myDouble = 120.40;
        lastString = lastString + myDouble;
        System.out.println("Example: " + lastString);


    }
}

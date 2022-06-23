package com.markdemus;

public class Main {

    public static void main(String[] args) {
        
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float min value = " + myMinFloatValue);
        System.out.println("Float min value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double min value = " + myMinDoubleValue);
        System.out.println("Double min value = " + myMaxDoubleValue);

        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 3f;
        double myDouble = 5d / 3d;
        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDouble);

        //Challenge convert float to double
        //when adding / 2 for the float and double it doesn't handle the remainder

    
    }
}

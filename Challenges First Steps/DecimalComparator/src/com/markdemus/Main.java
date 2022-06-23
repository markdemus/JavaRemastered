package com.markdemus;

public class Main {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(2.332, 2.332));

    }

    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo) {

        int a = (int) (numberOne * 1000);
        int b = (int) (numberTwo * 1000);
        return  a == b;
    }
}

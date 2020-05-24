package com.markdemus;

public class Main {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.1756));
    }

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        int c = (int) (a *1000);
        int d = (int) (b *1000);
        return  c == d;
    }
}

package com.markdemus;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasEqualSum(2,3,5));
    }

    public static boolean hasEqualSum(int a, int b, int c) {
        int d = (a + b);
        int e = c;
        return d == e;
    }
}
package com.markdemus;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasTeen(14, 15, 16));
        System.out.println(isTeen(13));

    }

    public static boolean hasTeen(int a, int b, int c) {
        if(a >= 13 && a <= 19) {
            return true;
        } else if
            (b >= 13 && b <= 19) {
                return true;
            } else if (c >= 13 && c <= 19) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int d) {
        if(d >= 13 && d <= 19) {
            return true;
        }
        return false;
    }
}


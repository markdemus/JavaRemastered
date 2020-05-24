package com.markdemus;

public class Main {

    public static void main(String[] args) {

        System.out.println(isLeapYear(1800));
    }

    private static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            System.out.println("Year is out of range");
            return false;
        } else if (year % 100 == 0) {
            System.out.println(year + " is a leap year.");
            return true;
        } else if (year % 400 == 0) {
            System.out.println(year + " is not a leap year.");
            return true;
        } else if (year % 4 == 0) {
            System.out.println(year + " is a leap year.");
            return true;
        } else {
            return false;
        }
    }
}

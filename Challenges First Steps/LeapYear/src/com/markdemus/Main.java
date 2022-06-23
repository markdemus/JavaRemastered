package com.markdemus;

public class Main {

    public static void main(String[] args) {

        boolean year = isLeapYear(2016);
        System.out.println(year);

    }

    public static boolean isLeapYear(int year) {

        if(year < 1 && year > 9999) {
            return false;
        } else if((year % 4 == 0 && year % 100 == 0) && year % 400 == 0) {
            return true;
        } else if(year % 4 != 0 && year % 400 != 0) {
            return false;
        } else if(year % 100 != 0) {
            return true;
        } else {
            return false;
        }
    }
}

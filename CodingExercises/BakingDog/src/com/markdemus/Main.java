package com.markdemus;

public class Main {

    public static void main(String[] args) {
	    shouldWakeUp(true, 7);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if(hourOfDay < 0 || hourOfDay > 23) {
            System.out.println("False");
            return false;
        } else if (barking && hourOfDay < 8 || hourOfDay > 22) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
    }
}

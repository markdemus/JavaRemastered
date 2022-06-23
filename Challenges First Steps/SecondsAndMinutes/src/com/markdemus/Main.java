package com.markdemus;


public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {



        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945L));


    }

    public static String getDurationString(long minutes, long seconds) {
        long totalHours = minutes / 60;
        long remainingMinutes = minutes % 60; //added code
//        long totalMinutes = seconds / 60; //removed code
//        long sum = totalHours + totalMinutes / 3600; // removed code
        if(minutes > 0 && seconds > 0 || seconds < 59) {
            return totalHours + "hrs " + remainingMinutes + "min " + seconds + "s";
        } else {
            return INVALID_VALUE_MESSAGE; //Using Constant
        }
    }
    public static String getDurationString(long seconds) {

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60; //added code
        if(seconds > 0) {
            return getDurationString(minutes,remainingSeconds);
        } else {
            return INVALID_VALUE_MESSAGE;
        }

    }
}

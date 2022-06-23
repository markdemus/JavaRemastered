package com.markdemus;

public class Main {

    public static void main(String[] args) {

        printYearsAndDays(525600);
    }

    public static void printYearsAndDays(long minutes){

        long day = (minutes / 60) / 24;
        long year = (minutes / 1440) / 365;


        if(minutes < 0){
            System.out.println("Invalid value");
        }

        System.out.println(minutes + " min "  + year + " years " + day + " days ");

    }
}

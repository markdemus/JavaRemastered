package com.markdemus;

public class Main {

    public static void main(String[] args) {

        //byte
        //short
        //int
        //long
        //double
        //char
        //boolean
        String myString = "This is a string";
        System.out.println("My string is equal to " + myString);
        myString = myString + ", and this is more";
        System.out.println(myString);
        myString = myString + " \u00A9 2019";
        System.out.println(myString);
        String numberstring = "250";
        numberstring = numberstring + "49";
        System.out.println(numberstring);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);
    }
}

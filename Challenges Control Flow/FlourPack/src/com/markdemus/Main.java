package com.markdemus;

public class Main {

    /*
    1. Validation of the parameter values
    2. Determine the number of bigCount to use (all of it, or just a fraction of it).
    3. Determine if after subtracting the bigCount kilos of flour,
       do we have enough smallCount to fill the rest of the order.
     */
    public static void main(String[] args) {

        System.out.println(canPack(2,2,11));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        if(bigCount * 5 + smallCount < goal) {
            return false;
        } else {
            return (goal % 5 <= smallCount);
        }
    }
}

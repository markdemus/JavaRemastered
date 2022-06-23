package com.markdemus;

public class Main {

    public static void main(String[] args) {



        sumOdd(1,100);
    }

    public static boolean isOdd(int number) {

        if(number < 0) {
            return false;
        }
        return true;
    }

    public static void sumOdd(int start, int end) {

        int sum = 0;


        for(int i = start; i < end; i++) {
            if(i % 2 == 1) {
                sum += i;
                System.out.println(i + " is an odd number");
            }
            if(!isOdd(i)){
                System.out.println("Not odd");
            }
        }

        System.out.println("Sum = " + sum);
    }
}

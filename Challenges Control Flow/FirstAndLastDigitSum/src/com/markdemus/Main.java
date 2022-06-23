package com.markdemus;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(252));
    }

    public static int sumFirstAndLastDigit(int number) {

        int lastDigit = number % 10;
        int firstDigit = 0;

        while(number > 0) {
            //This will provide the first digit
            firstDigit = number % 10;
            number /= 10;
        }

        if(number < 0) {
            return -1;
        } else {
            return lastDigit + firstDigit;
        }
    }
}

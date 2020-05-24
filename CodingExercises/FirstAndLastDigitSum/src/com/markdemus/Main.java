package com.markdemus;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5));
    }

    public static int sumFirstAndLastDigit(int number) {
        int firstDigit = 0;
        int lastDigit;

        if(number >= 0 && number <=9) {
            return number + number;
        } else if (number > 9) {
            lastDigit = number % 10;
            number /= 10;

            while (number > 0) {
                if(number <= 9 && number >= 0) {
                    firstDigit = number;
                }
                number /= 10;
            }
            return lastDigit + firstDigit;
        } else {
            return -1;
        }
    }
}

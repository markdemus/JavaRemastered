package com.markdemus;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int lastDigit;
        int numberToCompare = number;

        while (number != 0) {

            lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }

        return reverse == numberToCompare;
    }
}

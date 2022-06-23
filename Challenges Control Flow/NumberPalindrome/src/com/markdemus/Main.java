package com.markdemus;

public class Main {

    public static void main(String[] args) {

        System.out.println(isPalindrome(707));

    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int lastDigit = 0;
        int num = number;

        while(num != 0) {
            lastDigit = num % 10;
            reverse *= 10;
            reverse += lastDigit;
            num /= 10;
        }

        if(reverse == number) {
            return true;
        } else {
            return false;
        }
    }
}

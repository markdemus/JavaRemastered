package com.markdemus;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(145));
    }

    private static int sumDigits(int number) {
        if(number < 10) {
            return -1;
        }

        int sum =0;

        //125 -> 125 / 10 = 12 * 10 = 120 -> 125 -120 = 5 to get the least significant digit

        while(number > 0) {
            //extract the least significatn digit
            int digit = number % 10;
            sum += digit;

            //drop the least significant digit
            number /= 10;

        }

        return sum;
    }
    //Challenge - NumberToWords

}

package com.markdemus;

public class Main {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(12345));
    }

    public static int getEvenDigitSum(int number) { //method signature
        //1. Validate
        if(number < 0) {
            return -1;
        }
        //2. Initiate variable
        int sum = 0;
        //3. Condition; while number is greater than 0
        while (number > 0) {
            //4. if to check even number
            if ((number % 2) == 0) { //testing if it is an even number
                sum += number % 10; //adds remainder of number to sum
            }
            //5. reduce number by 1 decimal point by setting number equal to number / 10
            number /= 10;
        }
        //6. returns sum of all even numbers from loop
        return sum;
    }
}
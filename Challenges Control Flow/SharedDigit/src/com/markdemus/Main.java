package com.markdemus;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    //1. Validate
    public static boolean hasSharedDigit(int a, int b){
        if(a < 10 && a > 99 || b < 10 && b > 99){
            return false;
        }


        //2. Condition
        while(a >= 10 && a <= 99 && b >= 10 && b <= 99 ){
            int numberAFirst = a / 10;
            int numberALast = a % 10;
            int numberBFirst = b / 10;
            int numberBLast = b % 10;

            return (numberAFirst == numberBFirst || numberALast == numberBLast ||
                    numberAFirst == numberBLast || numberALast == numberBFirst);

        }
        return false;
    }
}

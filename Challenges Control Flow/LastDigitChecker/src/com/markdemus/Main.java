package com.markdemus;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    //1. Validate
    public static boolean hasSameLastDigit(int num1, int num2, int num3){

        if((num1 < 10 || num1 > 1000) || (num2 < 10 || num2 > 1000) || (num3 < 10 || num3 > 1000)){
            return false;
        }

        //2. Condition
        while(((num1 >= 10 && num1 <= 1000) || (num2 >= 10 && num2 <= 1000) || (num3 >= 10 && num3 <= 1000))){
            int num1Last = num1 % 10;
            int num2Last = num2 % 10;
            int num3Last = num3 % 10;

            return ((num1Last == num2Last) || (num1Last == num3Last) || (num3Last == num2Last));

        }
        return false;
    }
    //Another method
    public static boolean isValid(int num4){
        return (num4 >= 10 && num4 <= 1000);
    }
}

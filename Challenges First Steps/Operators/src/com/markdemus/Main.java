package com.markdemus;

public class Main {

    public static void main(String[] args) {

        double myNumOne = 20d;
        double myNumTwo = 80d;
        double sumOfNums = (myNumOne + myNumTwo) * 100;
        System.out.println(sumOfNums);

        double remainingResult = sumOfNums % 40;
        System.out.println(remainingResult);

        boolean isRemain = remainingResult == 0 ? true : false;
        if(!isRemain) {
            System.out.println("Got some remainder");
        }



    }
}

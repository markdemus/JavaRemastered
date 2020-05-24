package com.markdemus;

public class OperatorChallenge {

    public static void main(String[] args) {

        double myBag = 20.00d;
        double herBag = 80.00d;

        double result = (myBag + herBag) * 100.00d;
        System.out.println("Total of the bags is " + result);

        result = result % 40.00d;

        System.out.println("The remainder of both bags when divided by 40 = " + result);

        boolean isNoRemainder = (result == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }


    }
}

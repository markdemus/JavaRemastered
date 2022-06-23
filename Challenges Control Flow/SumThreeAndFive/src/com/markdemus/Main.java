package com.markdemus;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        int sum = 0;

        for(int i = 1; i <= 1000; i++) {
            if((i % 3 == 0) && (i % 5 == 0)){
                count++; //let's know to break out the loop
                sum += i; //summing the value as we go through to print out once exited
                System.out.println("Found number = " + i);
            }

            if(count == 5) {
                break; //breaks out the for loop
            }
        }

        System.out.println("Sum = " + sum);
    }
}

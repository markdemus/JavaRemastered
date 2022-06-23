package com.markdemus;

public class Main {

    public static void main(String[] args) {

        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("410,000 at 5% interest = " + calculateInterest(410000.0, 5.0));
        System.out.println("30,000 at 10% interest = " + calculateInterest(30000.0, 10.0));

        for(int i = 0; i < 6; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        //Challenge 1: Use method below
//        for(int i = 2; i <=8; i++) {
//            System.out.println(String.format("%.2f",10000.0,i));
//        }

        //Challenge 2: decrement
        for(int i = 8; i >= 2; i--) {
            System.out.println(String.format("%.2f",calculateInterest(10000,i)));
        }

        //Challenge: Use the isPrime to and count the number of prime numbers and then break once it hits 3
        //int count = 0; //1. counting number of prime numbers

        for(int i = 2; i <= 20; i++) { //2. set for loop
            if (isPrime(i)) { //3. If method isPrime using i is true
                //count++; //increment count
                System.out.println("Number " + i + " is a prime number"); //4. print out
//                if(count == 3) { //5. break after 3
//                    System.out.println("Exiting for loop");
//                    break;
//                }
            }
        }

    }


    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }

    //Practice Example: Prime #s can be divided evenly by 1 or itself
    public static boolean isPrime(int n){

        if(n == 1) {
            return false;
        }

        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

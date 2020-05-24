package com.markdemus;

public class For {

    public static void main(String[] args) {
        System.out.println("10K at 2% interest rate = " + calculateInterest(10000.0, 2.0));

        for (double i = 2; i < 9; i++) {
            System.out.println("10K at " + i + " interest rate = " + String.format("%.2f", calculateInterest(10000, i))); //converts the number to use 2 places after the decimal and accepts everything to the left.
        }

        System.out.println("*************************************");

        for (double i = 8; i >= 2; i--) {
            System.out.println("10K at " + i + " interest rate = " + String.format("%.2f", calculateInterest(10000, i))); //converts the number to use 2 places after the decimal and accepts everything to the left.
        }

        //Challenge
        int count = 0;

        for(int i = 0; i <= 1000; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime #");
                if(count == 100) {
                    System.out.println("Exiting loop");
                    break;
                }

            }
        }
        //Challenge2
        int number = 0;
        int sum = 0;

        for(int i = 1; i <= 1000; i++) {
            if((i % 3 == 0) && ((i % 5 == 0))) {
                number++;
                sum += i;
                System.out.println("Found number = " + i);
            }

            if(number == 5) {
                break;
            }
        }

        System.out.println("Sum = " + sum);

    }

        public static boolean isPrime(int n) {
            if(n == 1) {
                return false;
            }
            for(int i = 2; i <= (long) Math.sqrt(n); i++) {
                System.out.println("Looping " +i);
                if(n % i == 0){
                    return false;
                }
        }
            return true;
    }

    private static double calculateInterest(double amount, double interestRate) {
        return(amount *(interestRate/100));

    }
}

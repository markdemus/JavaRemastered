package com.markdemus;

public class Main {

    public static void main(String[] args) {

        printNumberInWord(3);
    }

    public static void printNumberInWord(int number) {

        switch (number) {

            case 0:
                System.out.println("ZERO");
                break;

            case 1:
                System.out.println("ONE");
                break;

            case 2:
                System.out.println("TWO");
                break;

            case 3:
                System.out.println("THREE");
                break;

            case 4:
                System.out.println("FOUR");
                break;

            default:
                System.out.println("No number found");
                break;
        }
    }
}

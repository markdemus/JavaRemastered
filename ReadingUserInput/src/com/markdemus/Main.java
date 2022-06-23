package com.markdemus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //creating object of type scanner
        Scanner scanner = new Scanner(System.in);

        //Taking in an Integer; when placing this before entering your name it closes because it's calling next int but there isn't one; so we have to use nextLine() here
        System.out.println("Enter your year of birth.");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine();//allowing for Enter and producing the next line

        System.out.println("Enter your name: ");
        //Read a line of input from the console
        String name = scanner.nextLine();
        int age = 2022 - yearOfBirth;

        System.out.println("Your name is " + name + " and you are " + age + " years old!");

        //closing the scanner
        scanner.close();
    }
}

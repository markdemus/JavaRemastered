package com.markdemus;

public class IfThen {

    public static void main(String[] args) {

        boolean isAlien = false;// two equals mean "is equal to"; can be written as !isAlien for false statements,
        // if you put a semicolon above it will only execute line 10
        if (isAlien == true) {
            System.out.println("It is not an Alien!");
        }

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //Logical "and" Operator
        int topScore = 90;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 85;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //Logical "or" Operator
        int thirdTopScore = 70;
        if ((secondTopScore <= 90) || (thirdTopScore > 90) || (topScore == 90)) {
            System.out.println("Here, two statements are true.");
        }

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //assignment operator vs equals operator
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an error when there is an assignment operator instead of an is-equal operator, so this is true.");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("Will not get an error when assigning isCar to true since it is a boolean value, this is not supposed to happen. Use is-equal operator");
        }

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //Ternary Operator
        isCar = true;

        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

    }
}

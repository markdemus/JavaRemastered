package com.markdemus;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; //1 + 2 = 3. The equal operator is an assignment operator of left to right. Same with the + as an operand
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult); //= 3
        result = result - 1; //3 - 1 = 2
        System.out.println("3 - 1 = " + result);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3; //modulus - prints out remainder of (4 % 3) = 1
        System.out.println(result);

        //Abbreviating Operators
        result++; //1 + 1 = 2
        System.out.println(result);
        result--; //2 -1 = 1
        System.out.println(result);

        result += 2; // result = result + 2;
        System.out.println(result);

        result *= 10; //30
        System.out.println(result);

        result -= 2; //28
        System.out.println(result);

        result /= 2; //14
        System.out.println(result);

        //if-then section
        boolean isAlien = false;
        if(isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("I'm scared of aliens!");
        }

        //not equal to operator
        int topScore = 80;
        if(topScore < 100) {
            System.out.println("You got the high score!");
        }

        //and operator
        int secondTopScore = 81;
        if((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        //or operator
        if((topScore > 90) || (topScore <= 90)) {
            System.out.println("Either or both conditions are true");
        }

        //assignment vs equals to
        int newValue = 50;
        if(newValue == 50) {
            System.out.println("This is an error");
        }

        boolean isCar = false;
        if(!isCar) {
            System.out.println("This is not supposed to happen");
        }
        //Ternary operator
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar) {
            System.out.println("wasCar is true");
        }

        int ageOfClient = 20;
        boolean isEighteenOrOver = ageOfClient == 20 ? true : false;
        if(isEighteenOrOver) {
            System.out.println("You are 20");
        }

    }
}

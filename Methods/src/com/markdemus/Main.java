package com.markdemus;

public class Main {

    public static void main(String[] args) {
        //1 mile = 1.609344
//        double kilometers = (100 * 1.609344); //everything after the double is the expression
//        int highScore = 50; //The entire line is a Statement
//        if (highScore == 50) { //everything after if is the expression
//            System.out.println("This text is the expression");
//        }
//
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
//
//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000 but greater than 1000");
//        } else if (score < 1000) {
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got here");
//        }

//        if(gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 1000;
//            System.out.println("Your final score was " + finalScore);
//        }


        //int savedFinalScore = finalScore; // its outside the block so the previous variable is deleted
        /* challenge print out second score on screen with the following:
         * score set to 10000
         * levelCompleted set to 8
         * bonus set to 200
         * But first make sure the first prinout above still displays as well
         * */

//        boolean newGameOver = true;
//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//        if(newGameOver) {
//            int finalScore2 = score + (levelCompleted * bonus);
//            System.out.println("Here is score number two: " + finalScore2);
//        }

        //new Method
//        int highScore = calculateScore(true, 800,5,100);
//        calculateScore(true, 10000, 8, 200);
//        System.out.println(highScore);
        //challenge result
        int position = calculateHighScorePosition(1000);
        displayHighScorePosition("Mark", position);


    }

    //Method Section: Creating new method
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
            return -1;
    }

    //Challenge
    public static void displayHighScorePosition(String name, int position) {

        System.out.println(name + " managed to get into position " + position + " on the high table.");
    }

    public static int calculateHighScorePosition(int score) {


        if(score >= 1000) {
            return 1;
        } else if(score >= 500) { //simplified since its always true
            return 2;
        } else if(score >= 100) { //simplified since its always true
            return 3;
        } else {
            return 4;
        }
    }
    //after creating both methods now we need to call them above
}

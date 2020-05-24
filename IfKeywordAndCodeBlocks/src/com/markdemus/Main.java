package com.markdemus;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);
        //OR
        //calculateScore(gameOver, score, levelCompleted, bonus);

        //Challenge - create a new one with different numbers
        //gameOver = true;
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        //calculateScore(true,10000,8,200);
        //OR
        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        int highScorePosition = calculateHighScorePosition(1200);
        displayHighScorePosition("Mark", highScorePosition);

        highScorePosition = calculateHighScorePosition(800);
        displayHighScorePosition("Tim", highScorePosition);

        //Challenge vvvvvvvvv

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Joe", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Sarah", highScorePosition);

    }




    public static void displayHighScorePosition(String playerName, int scorePosition) {
        System.out.println(playerName + " managed to get into position " + scorePosition + " on the highscore table");

    }

    public static int calculateHighScorePosition(int score) {
/*
        if(score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        }

            return 4;*/
        //OR

        int position = 4; // assuming position 4 will be returned
        if(score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }

        return position;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        } else {
            return -1;
        }
    }
}

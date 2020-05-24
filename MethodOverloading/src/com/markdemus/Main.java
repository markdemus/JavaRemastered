package com.markdemus;

public class Main {

    public static void main(String[] args) {
	    int newScore = calculateScore("Mark", 12);
        System.out.println("New score is " + newScore);
        int newScore2 = calculateScore(0);
        System.out.println("New score is " + newScore2);
        calculateScore();

            double centimeters = calcFeetAndInchesToCentimeters(6, 0);
            if (centimeters < 0.0){
                System.out.println("Invalid parameters");
            }

            calcFeetAndInchesToCentimeters(74);

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No Player, no points");
        return 0;
    }

    //Challenge
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 12 ))){
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + "ft " + inches + "in = " + centimeters + "cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + "in = " + feet + "ft and " +remainingInches+ "in");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}

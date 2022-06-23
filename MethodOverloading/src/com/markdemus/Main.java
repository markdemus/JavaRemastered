package com.markdemus;

import java.util.jar.JarOutputStream;

public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("Mark", 500);
        System.out.println("New score is " + newScore);
        int newScore2 = calculateScore(400);
        System.out.println("This is from the second method " + newScore2);
        int newScore3 = calculateScore();

        double calculation1 = calcFeetAndInchesToCentimeters(0, 3);
        System.out.println(calculation1);
        double calculation2 = calcFeetAndInchesToCentimeters(24);
        System.out.println(calculation2);

        double duration = getDurationString(120, 60);
        System.out.println(duration);
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
        System.out.println("Unnamed Player scored unknown points");
        return 0;
    }

    //challenge
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if(feet > 0 && (inches > 0 || inches < 12)) {
            return ((feet * 12) + inches) * 2.54;
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches >= 0) {
            return inches / 12;
        } else {
            return -1;
        }
    }

    public static long getDurationString(long minutes, long seconds) {
        long totalHours = minutes / 60;
        long totalMinutes = seconds / 60;
        long sum = totalHours + totalMinutes / 3600;
        if(minutes >= 0 && seconds >= 0 || seconds <= 59) {
            return sum;
        } else {
            return -1;
        }
    }
    public static long getDurationString(long seconds) {

        long sumSeconds = seconds / 3600;
        if(seconds >= 0) {
            return sumSeconds;
        } else {
            return -1;
        }

    }
}

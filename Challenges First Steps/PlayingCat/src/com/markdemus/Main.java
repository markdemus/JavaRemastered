package com.markdemus;

public class Main {

    public static void main(String[] args) {

        System.out.println(isCatPlaying(false,35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {

        boolean isNotSummer = false;

        if(!summer && (temperature >= 25 && temperature <= 35)) {
            return true;
        } else {
            if (summer && (temperature >= 25 || temperature <= 45)){
                return false;
            }
        }
        return isNotSummer;
    }
}

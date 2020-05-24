package com.markdemus;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Mark";
//        player.health = 100;
//        player.weapon = "Bat";
//
//        int damage = 20;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 80;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Mark", 200, "Sword");
        System.out.println("Initial health is " + enhancedPlayer.getHealth());
    }
}

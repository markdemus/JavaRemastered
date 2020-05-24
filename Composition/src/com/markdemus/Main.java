package com.markdemus;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(13,13,1);
        Case theCase = new Case("220B", "DEll", "240", dimensions);

        Monitor monitor = new Monitor("16inch Beast", "MacBook", 16, new Resolution(1080,1080));

        Motherboard motherboard = new Motherboard("BJ-200", "Apple", 4, 4, "v2.25");

        PC thePC = new PC(theCase, monitor,motherboard);
        thePC.powerUp();
//        thePC.getMonitor().drawPixelAt(1500,2000,"red");
//        thePC.getMotherboard().loadProgram("OS13");
//        thePC.getTheCase().pressPowerButton();
    }
}

package com.markdemus;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid value");
        } else {
            int inMegaBytes = kiloBytes / 1024;
            int remainKiloBytes = kiloBytes % 1024;
            System.out.println(inMegaBytes + " KB = " + kiloBytes + " MB" + " and " + remainKiloBytes + " KB");
        }

    }
}

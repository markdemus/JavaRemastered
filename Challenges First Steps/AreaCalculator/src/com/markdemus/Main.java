package com.markdemus;

public class Main {

    public static void main(String[] args) {

        System.out.println(area(5));
        System.out.println(area(5, 5));
        System.out.println(area(-1));
        System.out.println(area(-1, 5));

    }

    public static double area(double radius) {

        double circle = Math.PI * (radius * radius);

        if(radius < 0) {
            return -1;
        }

        return circle;

    }

    public static double area(double x, double y) {

        double rectangle = x * y;

        if(x < 0 || y < 0) {
            return -1;
        }

        return rectangle;

    }

}

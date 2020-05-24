package com.markdemus;

public class Main {

    public static void main(String[] args) {
        double circle = area(1);
        System.out.println(circle);
        System.out.println(area(10,10));
    }

    public static double area(double radius) {
        double circle = radius * radius * Math.PI;
        if (radius < 0) {
            return -1;
        } else {
            return circle;
        }
    }

    public static double area(double x, double y) {
        double rectangle = x * y;
        if (x < 0 || y < 0) {
            return -1;
        } else {
            return rectangle;
        }
    }

//    OR

//    public static double area(double radius) {
//
//        if (radius < 0) {
//            return -1;
//        }
//
//        double areaOfCircle = radius * radius * Math.PI;
//        return areaOfCircle;
//
//    }
//
//    public static double area(double x, double y) {
//
//        if (x < 0 || y < 0) {
//            return -1;
//
//        }
//
//        double areaRectangle = x * y;
//        return areaRectangle;
//    }
}

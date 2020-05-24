package com.markdemus;

public class Main {

    public static void main(String[] args) {

        Car mercedes = new Car(); //created an object named gWagon based on the template car.
        Car dodge = new Car();
        mercedes.setModel("g-wagon"); //setting new model
        System.out.println("Model is " + mercedes.getModel());
    }
}

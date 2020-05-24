package com.markdemus;

public class Car {

    //State of the car
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;
    //Created Object in main

    //create a public method to attach all objects of the class to update the model
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        this.model = model; //when referring to the field of the class you want to update. > error in main since we can't access the new model there
        if(validModel.equals("s550") || validModel.equals("g-wagon")){
            this.model = model; //assign internal state/field to tbe assigned the value that's been passed to us.
        } else {
            this.model = "Unknown";
        }
    }

    //create getter
    public String getModel() {
        return this.model;
    }


}

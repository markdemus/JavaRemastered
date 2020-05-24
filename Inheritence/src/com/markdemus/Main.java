package com.markdemus;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal",1,1,5,50);

        Dog dog = new Dog("Husky",2,1,2,4,1,20,"Fluffy");
        dog.eat();
        //dog.walk();
        dog.run();
    }
}

package com.designpatterns.factorymethod.Animals;

public class Dog implements Animal{

    @Override
    public void displayBehaviour() {
        System.out.println("Bow, Bow!");
        System.out.println("Iam domestic animal");
    }
}

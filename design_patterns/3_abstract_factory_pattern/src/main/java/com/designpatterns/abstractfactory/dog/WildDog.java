package com.designpatterns.abstractfactory.dog;

public class WildDog implements Dog {
    @Override
    public void speak() {
        System.out.println("Bow! Bow! Bow!");
    }

    @Override
    public void displayBehaviour() {
        System.out.println("Wild dogs hunts their food");
    }
}

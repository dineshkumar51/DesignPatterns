package com.designpatterns.abstractfactory.dog;

public class DomesticDog implements Dog {
    @Override
    public void speak() {
        System.out.println("Bow! Bow!");
    }

    @Override
    public void displayBehaviour() {
        System.out.println("Domestic Dogs eats what their master feeds them");
    }
}

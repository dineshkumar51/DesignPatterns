package com.designpatterns.simplefactory.Animals;

public class Tiger implements Animal{

    @Override
    public void displayBehaviour() {
        System.out.println("Grr Grr!");
        System.out.println("Iam a wild animal");
    }
}

package com.designpatterns;

import com.designpatterns.simplefactory.AnimalFactory;
import com.designpatterns.simplefactory.Animals.Animal;

public class Main {

    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal = animalFactory.createAnimal("Dog");
        animal.displayBehaviour();
        animal = animalFactory.createAnimal("Tiger");
        animal.displayBehaviour();


    }
}

package com.designpatterns;

import com.designpatterns.simplefactory.AnimalFactory;
import com.designpatterns.simplefactory.Animals.Animal;
/*
It creates an object without exposing the instantiation logic to the client.
The factory pattern provides a centralized point of control for object creation, which makes maintenance and testing easier.
The factory pattern promotes code reusability by defining common creation logic in superclass methods
The factory pattern makes it easy to add new product types without modifying existing client code.
 */
public class Main {

    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal = animalFactory.createAnimal("Dog");
        animal.displayBehaviour();
        animal = animalFactory.createAnimal("Tiger");
        animal.displayBehaviour();


    }
}

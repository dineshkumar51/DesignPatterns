package com.designpatterns;

import com.designpatterns.factorymethod.factory.AnimalFactory;
import com.designpatterns.factorymethod.factory.DogFactory;
import com.designpatterns.factorymethod.factory.TigerFactory;
/*
It defines an interface for creating an object, but lets subclasses decide which class to instantiate.
The Factory Method pattern lets a class defer instantiation to subclasses.
 */
public class Main {

    public static void main(String[] args) {
        AnimalFactory animalFactory = new DogFactory();
        animalFactory.createAndDisplayAnimal();
        animalFactory = new TigerFactory();
        animalFactory.createAndDisplayAnimal();
    }
}

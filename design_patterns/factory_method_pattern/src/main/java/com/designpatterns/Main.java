package com.designpatterns;

import com.designpatterns.factorymethod.factory.AnimalFactory;
import com.designpatterns.factorymethod.factory.DogFactory;
import com.designpatterns.factorymethod.factory.TigerFactory;

public class Main {

    public static void main(String[] args) {
        AnimalFactory animalFactory = new DogFactory();
        animalFactory.createAndDisplayAnimal();
        animalFactory = new TigerFactory();
        animalFactory.createAndDisplayAnimal();
    }
}

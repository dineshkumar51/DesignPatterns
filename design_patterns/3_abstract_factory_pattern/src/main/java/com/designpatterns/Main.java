package com.designpatterns;

import com.designpatterns.abstractfactory.dog.Dog;
import com.designpatterns.abstractfactory.factory.AnimalFactory;
import com.designpatterns.abstractfactory.factory.FactoryProvider;
import com.designpatterns.abstractfactory.tiger.Tiger;

public class Main {

    public static void main(String[] args) {
        AnimalFactory animalFactory = FactoryProvider.getFactory("wild");
        Dog dog = animalFactory.createDog();
        dog.displayBehaviour();
        dog.speak();
        Tiger tiger = animalFactory.createTiger();
        tiger.speak();

        animalFactory = FactoryProvider.getFactory("domestic");
        dog = animalFactory.createDog();
        tiger = animalFactory.createTiger();

        dog.displayBehaviour();
        dog.speak();
        tiger.speak();
    }
}

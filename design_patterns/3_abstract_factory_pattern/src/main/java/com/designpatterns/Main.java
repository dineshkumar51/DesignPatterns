package com.designpatterns;

import com.designpatterns.abstractfactory.dog.Dog;
import com.designpatterns.abstractfactory.factory.AnimalFactory;
import com.designpatterns.abstractfactory.factory.FactoryProvider;
import com.designpatterns.abstractfactory.tiger.Tiger;

/*
An abstract factory is often referred to as a factory of factories .
In this pattern, you provide a way to encapsulate a group of individual factories that have a common theme.
In this process, you do not instantiate a class directly; instead, you instantiate a concrete factory and
thereafter create products using the factory.

The Abstract Factory provides you with an interface for creating objects from each class of the product family
 */

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

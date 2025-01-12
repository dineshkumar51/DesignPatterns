package com.designpatterns.abstractfactory.factory;

public class FactoryProvider {
    public static AnimalFactory getFactory(String animalType) {

        if (animalType.equals("wild")) {
            return new WildAnimalFactory();
        } else if (animalType.equals("domestic")) {
            return new DomesticAnimalFactory();
        } else {
            throw new IllegalArgumentException();
        }
    }

}

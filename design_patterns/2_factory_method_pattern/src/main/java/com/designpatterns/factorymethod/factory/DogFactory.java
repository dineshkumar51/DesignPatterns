package com.designpatterns.factorymethod.factory;

import com.designpatterns.factorymethod.Animals.Animal;
import com.designpatterns.factorymethod.Animals.Dog;

public class DogFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}

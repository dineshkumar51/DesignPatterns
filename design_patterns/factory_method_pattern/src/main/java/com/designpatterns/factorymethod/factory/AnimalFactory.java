package com.designpatterns.factorymethod.factory;

import com.designpatterns.factorymethod.Animals.Animal;

public abstract class AnimalFactory {

    public void createAndDisplayAnimal(){
        Animal animal = createAnimal();
        animal.displayBehaviour();
    }

    public abstract Animal createAnimal();
}

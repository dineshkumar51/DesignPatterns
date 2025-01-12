package com.designpatterns.factorymethod.factory;

import com.designpatterns.factorymethod.Animals.Animal;
import com.designpatterns.factorymethod.Animals.Tiger;

public class TigerFactory extends AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Tiger();
    }
}

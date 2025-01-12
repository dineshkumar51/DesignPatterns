package com.designpatterns.abstractfactory.factory;

import com.designpatterns.abstractfactory.dog.Dog;
import com.designpatterns.abstractfactory.dog.WildDog;
import com.designpatterns.abstractfactory.tiger.Tiger;
import com.designpatterns.abstractfactory.tiger.WildTiger;

public class WildAnimalFactory implements AnimalFactory{
    @Override
    public Dog createDog() {
        return new WildDog();
    }

    @Override
    public Tiger createTiger() {
        return new WildTiger();
    }
}

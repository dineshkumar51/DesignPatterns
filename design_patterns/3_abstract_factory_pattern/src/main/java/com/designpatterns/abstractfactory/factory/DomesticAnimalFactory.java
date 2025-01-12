package com.designpatterns.abstractfactory.factory;

import com.designpatterns.abstractfactory.dog.Dog;
import com.designpatterns.abstractfactory.dog.DomesticDog;
import com.designpatterns.abstractfactory.tiger.DomesticTiger;
import com.designpatterns.abstractfactory.tiger.Tiger;

public class DomesticAnimalFactory implements AnimalFactory {

    @Override
    public Dog createDog() {
        return new DomesticDog();
    }

    @Override
    public Tiger createTiger() {
        return new DomesticTiger();
    }
}

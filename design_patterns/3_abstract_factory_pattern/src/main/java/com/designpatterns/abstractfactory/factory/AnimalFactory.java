package com.designpatterns.abstractfactory.factory;

import com.designpatterns.abstractfactory.dog.Dog;
import com.designpatterns.abstractfactory.tiger.Tiger;

public interface AnimalFactory {
    Dog createDog();
    Tiger createTiger();
}

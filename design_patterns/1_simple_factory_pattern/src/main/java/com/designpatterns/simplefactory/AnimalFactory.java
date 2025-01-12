package com.designpatterns.simplefactory;

import com.designpatterns.simplefactory.Animals.Animal;
import com.designpatterns.simplefactory.Animals.Dog;
import com.designpatterns.simplefactory.Animals.Tiger;

public class AnimalFactory {

    public Animal createAnimal(String name) {
        if(name.equals("Dog")) {
            return new Dog();
        } else if(name.equals("Tiger")) {
            return new Tiger();
        } else {
            throw new IllegalArgumentException();
        }
    }
}

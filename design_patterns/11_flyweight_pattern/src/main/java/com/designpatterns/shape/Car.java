package com.designpatterns.shape;

public class Car implements Vehicle {

    private final String description;

    public Car(String description) {
        this.description = description;
    }
    @Override
    public void aboutMe(String colour) {
        System.out.println(description + " with the colour " + colour);
    }
}

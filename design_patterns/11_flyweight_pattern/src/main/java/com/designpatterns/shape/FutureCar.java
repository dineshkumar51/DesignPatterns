package com.designpatterns.shape;

public class FutureCar implements Vehicle {
    private final String description;

    public FutureCar(String description) {
        this.description = description;
    }

    //No sharable Flyweight since what ever the colour passed at any context its always blue.
    @Override
    public void aboutMe(String colour) {
        System.out.println(description + " with the colour blue");
    }
}

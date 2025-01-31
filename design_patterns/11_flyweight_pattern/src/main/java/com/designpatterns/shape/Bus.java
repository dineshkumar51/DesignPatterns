package com.designpatterns.shape;

public class Bus implements Vehicle {
    private final String description;

    public Bus(String description) {
        this.description = description;
    }
    @Override
    public void aboutMe(String colour) {
        System.out.println(description + " with the colour " + colour);
    }
}

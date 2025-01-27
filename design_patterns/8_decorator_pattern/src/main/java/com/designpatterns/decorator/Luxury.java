package com.designpatterns.decorator;

public abstract class Luxury implements Home{

    private final Home home;

    public Luxury(Home home) {
        this.home = home;
    }

    @Override
    public int getPrice() {
        return home.getPrice();
    }
}

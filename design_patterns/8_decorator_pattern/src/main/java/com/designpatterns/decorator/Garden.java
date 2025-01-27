package com.designpatterns.decorator;

public class Garden extends Luxury {

    private final int price = 600;

    public Garden(Home home) {
        super(home);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + price;
    }
}

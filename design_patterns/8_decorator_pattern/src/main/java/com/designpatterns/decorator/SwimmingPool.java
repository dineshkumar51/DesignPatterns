package com.designpatterns.decorator;

public class SwimmingPool extends Luxury {

    private final int price = 400;

    public SwimmingPool(Home home) {
        super(home);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + price;
    }
}

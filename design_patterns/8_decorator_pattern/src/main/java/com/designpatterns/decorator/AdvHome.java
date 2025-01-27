package com.designpatterns.decorator;

public class AdvHome implements Home {
    private final int basePrice;

    public AdvHome(int basePrice){
        this.basePrice = basePrice;
    }

    @Override
    public int getPrice() {
        return basePrice;
    }
}

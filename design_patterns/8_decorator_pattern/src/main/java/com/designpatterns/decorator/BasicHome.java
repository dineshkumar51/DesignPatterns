package com.designpatterns.decorator;

public class BasicHome implements Home{
    private final int basePrice;

    public BasicHome(int basePrice){
        this.basePrice = basePrice;
    }

    @Override
    public int getPrice() {
        return basePrice;
    }
}

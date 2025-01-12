package com.designpatterns.abstractfactory.tiger;

public class DomesticTiger implements Tiger {

    @Override
    public void speak() {
        System.out.println("Grrr!");
    }
}

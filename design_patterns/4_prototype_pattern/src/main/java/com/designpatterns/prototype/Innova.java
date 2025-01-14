package com.designpatterns.prototype;

import java.util.Random;

public class Innova extends Car {

    public Innova(String modelName) {
        this.setBasePrice(20_00_000);
        this.setOnRoadPrice(this.getBasePrice() + new Random().nextInt(10000));
        this.setModel(modelName);
    }

    @Override
    public Innova clone() throws CloneNotSupportedException {
        return (Innova) super.clone();
    }
}

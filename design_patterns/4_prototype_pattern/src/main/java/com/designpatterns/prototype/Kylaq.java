package com.designpatterns.prototype;

import java.util.Random;

public class Kylaq extends Car{

    public Kylaq(String modelName){
        this.setBasePrice(13_00_000);
        this.setOnRoadPrice(this.getBasePrice() + new Random().nextInt(1000));
        this.setModel(modelName);
    }

    @Override
    public Kylaq clone() throws CloneNotSupportedException {
        return (Kylaq) super.clone();
    }
}

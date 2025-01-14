package com.designpatterns.prototype;

public abstract class Car implements Cloneable {

    private int basePrice;
    private int onRoadPrice;
    private String model;

    public int getBasePrice() {
        return basePrice;
    }

    public int getOnRoadPrice() {
        return onRoadPrice;
    }

    public String getModel() {
        return model;
    }

    public void setOnRoadPrice(int onRoadPrice) {
        this.onRoadPrice = onRoadPrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
            return (Car) super.clone();
    }
}

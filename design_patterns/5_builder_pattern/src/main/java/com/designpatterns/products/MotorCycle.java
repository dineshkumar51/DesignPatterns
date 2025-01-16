package com.designpatterns.products;

public class MotorCycle extends Vehicle {

    private String brandName;

    public MotorCycle(String brandName) {
        super();
        this.brandName = brandName;
    }

    public String getBrandName(){
        return brandName;
    }

}

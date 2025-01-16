package com.designpatterns.products;

public class Car extends Vehicle {

    private String brandName;

    public Car(String brandName) {
        super();
        this.brandName = brandName;
    }

    public String getBrandName(){
        return brandName;
    }
}

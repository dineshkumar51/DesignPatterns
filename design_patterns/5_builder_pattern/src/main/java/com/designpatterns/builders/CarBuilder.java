package com.designpatterns.builders;

import com.designpatterns.products.Car;

public class CarBuilder implements Builder {

    Car car;

    public CarBuilder(String brandName) {
        car = new Car(brandName);
    }

    @Override
    public Builder addBrand() {
        car.add(car.getBrandName());
        return this;
    }

    @Override
    public Builder constructEngine() {
        car.add("2500cc 1.5 litre engine");
        return this;
    }

    @Override
    public Builder constructBody() {
        car.add("Black Metal body");
        return this;
    }

    @Override
    public Builder constructSeats() {
        car.add("leather Ventilated seats");
        return this;
    }

    @Override
    public Car getVehicle() {
        return car;
    }
}

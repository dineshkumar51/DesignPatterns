package com.designpatterns.builders;

import com.designpatterns.products.MotorCycle;

public class MotorCycleBuilder implements Builder {

    MotorCycle motorCycle;

    public MotorCycleBuilder(String brandName) {
        motorCycle = new MotorCycle(brandName);
    }

    @Override
    public Builder addBrand() {
        motorCycle.add(motorCycle.getBrandName());
        return this;
    }

    @Override
    public Builder constructEngine() {
        motorCycle.add("250cc 0.5 litre engine");
        return this;
    }

    @Override
    public Builder constructBody() {
        motorCycle.add("Red Metal and plastic body");
        return this;
    }

    @Override
    public Builder constructSeats() {
        motorCycle.add("leather seats");
        return this;
    }

    @Override
    public MotorCycle getVehicle() {
        return motorCycle;
    }
}

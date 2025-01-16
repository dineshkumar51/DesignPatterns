package com.designpatterns;


import com.designpatterns.builders.Builder;
import com.designpatterns.builders.CarBuilder;
import com.designpatterns.builders.MotorCycleBuilder;
import com.designpatterns.products.Vehicle;


/*
The Builder pattern is useful for creating complex objects that have multiple parts.
The object creation process should be independent of these parts. In addition,
you should be able to use the same construction process to create different representations of the objects.
 */
public class Main {

    public static void main(String[] args) {
        Builder vehicleBuilder = new CarBuilder("BMW");
        Vehicle vehicle = vehicleBuilder
                .constructEngine()
                .addBrand()
                .constructBody()
                .constructSeats()
                .getVehicle();

        vehicle.display();

        vehicleBuilder = new MotorCycleBuilder("pulser");
        vehicle = vehicleBuilder
                .constructEngine()
                .constructSeats()
                .constructBody()
                .addBrand()
                .getVehicle();

        vehicle.display();

    }
}

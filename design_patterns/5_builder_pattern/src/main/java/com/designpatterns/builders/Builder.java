package com.designpatterns.builders;

import com.designpatterns.products.Vehicle;

public interface Builder {

    Builder addBrand();
    Builder constructEngine();
    Builder constructBody();
    Builder constructSeats();
    Vehicle getVehicle();
}

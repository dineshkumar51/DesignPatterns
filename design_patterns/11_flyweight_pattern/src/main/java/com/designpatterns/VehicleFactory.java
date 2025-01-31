package com.designpatterns;

import com.designpatterns.shape.Bus;
import com.designpatterns.shape.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {

    private final Map<String, Vehicle> objectStore = new HashMap<>();

    public synchronized Vehicle getVehicle(String name){
        if(!objectStore.containsKey(name)){
            switch (name) {
                case "car" : objectStore.put(name, new Bus("5 seater car"));
                    break;
                case "bus" : objectStore.put(name, new Bus("50 seater bus"));
                    break;
                case "futureCar" : objectStore.put(name, new Bus("Single seater car"));
                    break;
                default : throw new IllegalArgumentException("Illegal Vehicle name");
            }
        }
        return objectStore.get(name);
    }

    public int getObjectCount() {
        return objectStore.size();
    }
}

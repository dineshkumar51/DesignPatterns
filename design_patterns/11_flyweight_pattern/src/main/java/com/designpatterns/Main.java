package com.designpatterns;

/*
Sometimes you need to handle lots of objects that are very similar (but not the same).
But the constraint is that you cannot create all of them to lessen resource and memory usage.
The Flyweight pattern is made to handle these scenarios.



A flyweight is a shared object that can be used in multiple contexts simultaneously.
The flyweight acts as an independent object in each context—it’s indistinguishable from an instance of the object that’s not shared.
Flyweights cannot make assumptions about the context in which they operate.
The key concept here is the distinction between intrinsic and extrinsic states.
The intrinsic state is stored in the flyweight; it consists of information that’s independent of the flyweight’s context,
thereby making it sharable. The extrinsic state depends on and varies with the flyweight’s context and therefore can’t be shared.
Client objects are responsible for passing extrinsic state to the flyweight when it needs it.

// In this example colour is extrinsic property
 */

import com.designpatterns.shape.Vehicle;

public class Main {


    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle car = vehicleFactory.getVehicle("car");
        car.aboutMe("Blue");

        car =  vehicleFactory.getVehicle("car");
        car.aboutMe("Red");

        car =  vehicleFactory.getVehicle("car");
        car.aboutMe("Green");

        System.out.println(vehicleFactory.getObjectCount());
    }
}

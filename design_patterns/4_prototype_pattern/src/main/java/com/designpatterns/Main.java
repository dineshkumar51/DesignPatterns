package com.designpatterns;

import com.designpatterns.prototype.Car;
import com.designpatterns.prototype.CarProvider;

/*
This pattern provides an alternative method for instantiating new objects by copying or cloning an instance of an existing object.
Thus, you can avoid the expense of creating a new instance using this concept.
 */

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        CarProvider carProvider = new CarProvider();

        Car car = carProvider.getInnova();
        Car car1 = carProvider.getInnova();

        Car car2 = carProvider.getKylaq();
        Car car3 = carProvider.getKylaq();

        System.out.println(car.getModel() + " - " +car.getOnRoadPrice() + " - " + car);
        System.out.println(car1.getModel() + " - " +car1.getOnRoadPrice() + " - " + car1);
        System.out.println(car2.getModel() + " - " +car2.getOnRoadPrice() + " - " + car2);
        System.out.println(car3.getModel() + " - " +car3.getOnRoadPrice() + " - " + car3);
    }
}

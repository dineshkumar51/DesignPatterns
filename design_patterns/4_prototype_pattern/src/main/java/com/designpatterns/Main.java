package com.designpatterns;

import com.designpatterns.prototype.Car;
import com.designpatterns.prototype.CarProvider;

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

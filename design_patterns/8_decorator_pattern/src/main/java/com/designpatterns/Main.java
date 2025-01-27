package com.designpatterns;


import com.designpatterns.decorator.BasicHome;
import com.designpatterns.decorator.Garden;
import com.designpatterns.decorator.Home;
import com.designpatterns.decorator.SwimmingPool;
/*
    It attaches additional responsibilities to an object dynamically.
    Decorators provide a flexible alternative to subclassing for extending functionality.
 */
public class Main {

    public static void main(String[] args) {

        Home home = new BasicHome(1000);

        home = new SwimmingPool(home);
        home = new Garden(home);

        System.out.println(home.getPrice());


        home = new BasicHome(2000);

        home = new Garden(home);
        home = new SwimmingPool(home);

        System.out.println(home.getPrice());
    }
}

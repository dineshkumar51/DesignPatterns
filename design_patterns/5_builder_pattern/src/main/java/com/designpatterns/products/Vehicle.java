package com.designpatterns.products;

import java.util.LinkedList;

public abstract class Vehicle {

    private LinkedList<String> parts;

    public Vehicle(){
        parts = new LinkedList<>();
    }

    public void add(String part){
        parts.addLast(part);
    }

    public void display() {
        System.out.println("****************** Displaying the Vehicle *****************");
        for(String part : parts) {
            System.out.println(part);
        }
        System.out.println("*******************************************************");
    }



}

package com.designpatterns.singleton;

public final class Captian1 {

    private static final Captian1 caption1 = new Captian1();

    private Captian1() {
        System.out.println("Creating the Captain1 instance");
    }

    public static Captian1 getInstance() {
        return caption1;
    }
}

package com.designpatterns.singleton;

public final class Captain2 {

    private static Captain2 captain2;

    private Captain2() {
        System.out.println("Creating the Captain2 instance");
    }

    public static synchronized Captain2 getInstance() {
        if(captain2 == null){
            captain2 = new Captain2();
        }
        return captain2;
    }
}

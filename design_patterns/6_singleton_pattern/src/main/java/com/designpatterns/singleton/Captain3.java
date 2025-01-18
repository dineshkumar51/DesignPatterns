package com.designpatterns.singleton;

public final class Captain3 {

    private static Captain3 captain3;

    private Captain3() {
        System.out.println("Creating the Captain3 instance");
    }

    public static Captain3 getInstance(){

        if(captain3 == null){
            synchronized(Captain3.class){
                if(captain3 == null){
                    captain3 = new Captain3();
                }
            }
        }
        return captain3;
    }
}

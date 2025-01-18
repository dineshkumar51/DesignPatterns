package com.designpatterns;


import com.designpatterns.singleton.Captain2;
import com.designpatterns.singleton.Captain3;
import com.designpatterns.singleton.Captian1;
import com.designpatterns.singleton.Captian4;

/*
It ensures that a class has only one instance and provides a global point of access to it.
 */

public class Main {

    public static void main(String[] args) {
        Captian1 caption1 = Captian1.getInstance();

        Captain2 captain2 = Captain2.getInstance();

        Captain3 captain3 = Captain3.getInstance();

        Captian4 captian4 = Captian4.INSTANCE;
    }
}

package com.designpatterns;

import com.designpatterns.adaptor.Adaptor;
import com.designpatterns.adaptor.tri.ConcreTriangle;
import com.designpatterns.adaptor.tri.Triangle;

/*
It converts the interface of a class into another interface that clients expect.
The Adapter pattern lets classes work together that could not otherwise because of incompatible interfaces.
 */

public class Main {

    public static void main(String[] args) {
        Triangle triangle = new ConcreTriangle(2,4);
        Adaptor rectangle = new Adaptor(triangle);

        rectangle.aboutMe();
        rectangle.calculateArea();
    }
}

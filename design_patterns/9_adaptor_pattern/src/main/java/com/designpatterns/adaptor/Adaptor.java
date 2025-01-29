package com.designpatterns.adaptor;

import com.designpatterns.adaptor.rec.Rectangle;
import com.designpatterns.adaptor.tri.Triangle;

public class Adaptor implements Rectangle {

    private Triangle triangle;

    public Adaptor(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public void aboutMe() {
        triangle.aboutMe();
    }

    @Override
    public void calculateArea() {
        triangle.calculateTriangleArea();;
    }
}

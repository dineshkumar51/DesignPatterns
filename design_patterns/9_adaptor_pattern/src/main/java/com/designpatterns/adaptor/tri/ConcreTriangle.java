package com.designpatterns.adaptor.tri;

public class ConcreTriangle implements Triangle {

    private int height;
    private int breadth;

    public ConcreTriangle(int height, int breadth){
        this.height = height;
        this.breadth = breadth;
    }

    @Override
    public void aboutMe() {
        System.out.println("Iam a triangle");
    }

    @Override
    public void calculateTriangleArea() {
        System.out.println("Area of the triangle is : "+(0.5f * height * breadth));
    }
}

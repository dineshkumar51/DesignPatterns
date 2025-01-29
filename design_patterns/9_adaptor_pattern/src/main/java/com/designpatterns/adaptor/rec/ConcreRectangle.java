package com.designpatterns.adaptor.rec;

public class ConcreRectangle implements Rectangle {

    private int length;
    private int breadth;

    public ConcreRectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public void aboutMe() {
        System.out.println("Iam a rectangle");
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of the rectangle is : " + (length * breadth));
    }
}

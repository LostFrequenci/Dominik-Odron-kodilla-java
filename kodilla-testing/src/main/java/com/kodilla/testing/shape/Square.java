package com.kodilla.testing.shape;

public class Square implements Shape {

    @Override
    public String getShapeName() {
        return "Shape : square.";
    }

    @Override
    public double getField(double a,double b) {
        return a*b;
    }
}

package com.kodilla.testing.shape;

public class Circle implements Shape {
    @Override
    public String getShapeName() {
        return "Shape : circle.";
    }

    @Override
    public double getField(double r, double d) {
        return 3.14*r*r;
    }

}

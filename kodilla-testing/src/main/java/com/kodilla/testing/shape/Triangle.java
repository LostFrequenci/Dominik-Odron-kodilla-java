package com.kodilla.testing.shape;

public class Triangle implements Shape {
    @Override
    public String getShapeName() {
        return "Shape : triangle.";
    }

    @Override
    public double getField(double a, double h) {
        return (a*h)/2;
    }

}

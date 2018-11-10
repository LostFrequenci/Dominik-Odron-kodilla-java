package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapesList = new ArrayList<Shape>();

    public void addFigure(Shape shape){
        shapesList.add(shape);
    }

    public void removeFigure(Shape shape){
        shapesList.remove(shape);
    }

    public Shape getFigure(int n){
        Shape theShape = null;
        if (n >= 0 && n < shapesList.size()) {
            theShape = shapesList.get(n);
        }
        return theShape;
    }

    public String showFigures(Shape shape){
        return shape.getShapeName();
    }

    public int getFiguresQuantity(){
        return shapesList.size();
    }
}

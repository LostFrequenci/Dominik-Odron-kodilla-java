package com.kodilla.testing.shape;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;

public class ShapeCollectorTestSuite {

    private  static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTest(){
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddShape() {
        //Given
        ShapeCollector newShape1 = new ShapeCollector();
        Circle circle = new Circle();
        Square square = new Square();
        //When
        newShape1.addFigure(circle);
        newShape1.addFigure(square);
        //Then
        Assert.assertEquals(2, newShape1.getFiguresQuantity());
    }

    @Test
    public void testRemoveShape() {
        //Given
        ShapeCollector newShape1 = new ShapeCollector();
        Circle circle = new Circle();
        Square square = new Square();
        //When
        newShape1.addFigure(circle);
        newShape1.addFigure(square);
        newShape1.removeFigure(circle);
        //Then
        Assert.assertEquals(1, newShape1.getFiguresQuantity());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector newShape1 = new ShapeCollector();
        Circle circle = new Circle();
        Square square = new Square();
        //When
        newShape1.addFigure(circle);
        newShape1.addFigure(square);
        Shape retrievedShape;
        retrievedShape = newShape1.getFigure(0);

        //Then
        Assert.assertEquals(circle, retrievedShape);
    }

    @Test
    public void testShowFigures(){
        //Given
        ShapeCollector newShape1 = new ShapeCollector();
        Circle circle = new Circle();
        Square square = new Square();
        Square triangle = new Square();
        //When
        newShape1.addFigure(circle);
        newShape1.addFigure(square);
        newShape1.addFigure(triangle);

        String retrievedFigures = newShape1.showFigures(circle);
        //Then
        Assert.assertEquals(circle.getShapeName(), retrievedFigures);


    }

}

package com.kodilla.patternsVol2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal theCost = theOrder.getCost();
        System.out.println("Cost of pizza is: "+theCost);
        //Then
        assertEquals(new BigDecimal(15),theCost);
    }
    @Test
    public void testBasicPizzaOrderGetComponents(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String theComponents = theOrder.getComponents();
        System.out.println(theComponents);
        //Then
        assertEquals("Pizza with components: tomato sauce, cheese",theComponents);
    }
    @Test
    public void testOwnPizzaNr1OrderGetCost(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SalamiDecorator(theOrder);
        theOrder = new ChickenDecorator(theOrder);
        theOrder = new PepperDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new OnionDecorator(theOrder);
                //When
        BigDecimal theCost = theOrder.getCost();
        System.out.println("Cost of pizza is: "+theCost);
        //Then
        assertEquals(new BigDecimal(24),theCost);
    }
    @Test
    public void testOwnPizzaNr1OrderGetComponents(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SalamiDecorator(theOrder);
        theOrder = new ChickenDecorator(theOrder);
        theOrder = new PepperDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new OnionDecorator(theOrder);
        //When
        String theComponents = theOrder.getComponents();
        System.out.println(theComponents);
        //Then
        assertEquals("Pizza with components: tomato sauce, cheese, salami, chicken, pepper, mushrooms, onion",theComponents);
    }
    @Test
    public void testOwnPizzaNr2OrderGetCost(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SalamiDecorator(theOrder);
        theOrder = new ChickenDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new OlivesDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        System.out.println("Cost of pizza is: "+theCost);
        //Then
        assertEquals(new BigDecimal(25),theCost);
    }
    @Test
    public void testOwnPizzaNr2OrderGetComponents(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SalamiDecorator(theOrder);
        theOrder = new ChickenDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new OlivesDecorator(theOrder);
        //When
        String theComponents = theOrder.getComponents();
        System.out.println(theComponents);
        //Then
        assertEquals("Pizza with components: tomato sauce, cheese, salami, chicken, mushrooms, olives",theComponents);
    }
    @Test
    public void testOwnPizzaNr3OrderGetCost(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SalamiDecorator(theOrder);
        theOrder = new ChickenDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new OlivesDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        System.out.println("Cost of pizza is: "+theCost);
        //Then
        assertEquals(new BigDecimal(28),theCost);
    }
    @Test
    public void testOwnPizzaNr3OrderGetComponents(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SalamiDecorator(theOrder);
        theOrder = new ChickenDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new OlivesDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        //When
        String theComponents = theOrder.getComponents();
        System.out.println(theComponents);
        //Then
        assertEquals("Pizza with components: tomato sauce, cheese, salami, chicken, mushrooms, olives + extra cheese",theComponents);
    }
}

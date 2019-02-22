package com.kodilla.patternsVol2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder {
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15.00);
    }

    @Override
    public String getComponents() {
        return "Pizza with components: tomato sauce, cheese";
    }
}

package com.kodilla.patternsVol2.decorator.pizza;

import java.math.BigDecimal;

public interface PizzaOrder {
    BigDecimal getCost();
    String getComponents();
}

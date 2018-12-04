package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderProcess {

    public Producent orderProcess(String product, int quantity) {

        if(quantity<100){
            return new ExtraFoodShop(product, quantity);
        } else if(quantity>=100 && quantity<150){
            return new HealthyShop(product, quantity);
        } else {
            return new GlutenFreeShop(product, quantity);
        }
    }
}

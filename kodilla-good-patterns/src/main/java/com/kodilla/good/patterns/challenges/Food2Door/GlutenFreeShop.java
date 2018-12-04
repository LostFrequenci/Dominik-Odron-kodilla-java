package com.kodilla.good.patterns.challenges.Food2Door;

public class GlutenFreeShop implements Producent {

    private String product;
    private int quantity;

    public GlutenFreeShop(String product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public String getProduct() {
        return product;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public boolean process() {
        System.out.println("Order processed : " + product + ", quantity : " + quantity);
        return true;
    }
}

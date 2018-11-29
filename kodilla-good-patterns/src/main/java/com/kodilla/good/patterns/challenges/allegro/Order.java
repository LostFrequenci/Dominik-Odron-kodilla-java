package com.kodilla.good.patterns.challenges.allegro;

public class Order {

    public User user;
    public String product;
    public int price;

    public Order(User user, String product, int price) {
        this.user = user;
        this.product = product;
        this.price = price;
    }

    public User getUser() {
        return user;
    }

    public String getProduct() {
        return product;
    }

    public int getPrice() {
        return price;
    }
}

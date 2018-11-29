package com.kodilla.good.patterns.challenges.allegro;

public class OrderRepository {
    public boolean createOrder(Order order) {
        System.out.println("Ordered for: " + order.getUser().getName() + " , " + order.getUser().getSurname()
                + " , product : " + order.getProduct() + " , price: " + order.getPrice());
        return true;
    }
}


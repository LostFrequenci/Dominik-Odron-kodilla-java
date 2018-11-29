package com.kodilla.good.patterns.challenges.allegro;

public class OrderService {
    public boolean selling(Order order) {
        System.out.println("Ordered for: " + order.getUser().getName() + " , " + order.getUser().getSurname()
                + " , product : " + order.getProduct() + " , price: " + order.getPrice());
        return true;
    }
}
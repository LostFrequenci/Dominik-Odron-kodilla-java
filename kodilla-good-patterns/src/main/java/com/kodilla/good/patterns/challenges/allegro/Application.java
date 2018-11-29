package com.kodilla.good.patterns.challenges.allegro;

public class Application {
    public static void main(String[] args) {
        OrderRetriever orderRetriever = new OrderRetriever();
        Order order1 = orderRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new InformationService(),new OrderService(),new OrderRepository());
        productOrderService.process(order1);

    }
}

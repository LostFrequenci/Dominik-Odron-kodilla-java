package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderRespository {

    public boolean createOrder(String producerName, String product, int quantity) {
        System.out.println("Producer : " + producerName + ", order : " + product + ", quantity : " + quantity);
        return true;
    }
}

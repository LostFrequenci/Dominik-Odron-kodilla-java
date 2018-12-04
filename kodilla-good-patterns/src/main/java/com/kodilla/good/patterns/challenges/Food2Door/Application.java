package com.kodilla.good.patterns.challenges.Food2Door;

public class Application {

    public static void main(String[] args) {

        OrderProcess orderProcess = new OrderProcess();
        Producent producent = orderProcess.orderProcess("Carrots", 500);
        FoodOrderService foodOrderService = new FoodOrderService(new OrderRespository());
        foodOrderService.runner(producent);
    }
}

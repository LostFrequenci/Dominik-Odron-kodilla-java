package com.kodilla.good.patterns.challenges.Food2Door;

public class FoodOrderService {

    private OrderRespository orderRespository;

    public FoodOrderService(OrderRespository orderRespository){
        this.orderRespository = orderRespository;
    }

    public OrderDto runner(Producent producent){
        boolean isOrder = producent.process();

        if (isOrder) {
            orderRespository.createOrder(producent.getClass().getSimpleName(), producent.getProduct(), producent.getQuantity());
            return new OrderDto(producent.getProduct(), producent.getQuantity(), true);
        } else {
            return new OrderDto(producent.getProduct(), producent.getQuantity(), false);
        }
    }
}

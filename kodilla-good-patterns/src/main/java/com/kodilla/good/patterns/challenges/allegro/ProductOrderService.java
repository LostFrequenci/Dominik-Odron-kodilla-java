package com.kodilla.good.patterns.challenges.allegro;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService,final OrderService orderService,final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final Order order) {
        boolean isOrdered = orderService.selling(order);

        if(isOrdered) {
            informationService.sendInformation(order);
            orderRepository.createOrder(order);
            return new OrderDto(order.getUser(), true);
        } else {
            return new OrderDto(order.getUser(), false);
        }
    }
}
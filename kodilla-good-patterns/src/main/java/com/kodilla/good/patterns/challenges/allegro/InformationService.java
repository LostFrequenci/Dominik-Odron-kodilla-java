package com.kodilla.good.patterns.challenges.allegro;

public class InformationService {

    public boolean sendInformation(Order order) {
        System.out.println("User : "+order.getUser().getName()+" , "+order.getUser().getSurname()+" ordered : "+order.getProduct()+" , price : "+order.getPrice());
        return true;
    }
}

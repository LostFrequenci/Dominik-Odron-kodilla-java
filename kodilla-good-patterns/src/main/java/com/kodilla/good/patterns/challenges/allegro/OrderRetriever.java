package com.kodilla.good.patterns.challenges.allegro;

public class OrderRetriever {

    public Order retrieve(){
        User user = new User("John","Lebowski");
        String product = "Samsung Galaxy S8";
        int price = 2800;

        return new Order(user,product,price);
    }
}

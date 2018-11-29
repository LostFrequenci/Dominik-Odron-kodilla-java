package com.kodilla.good.patterns.challenges.allegro;

public class OrderDto {

    public User user;
    public boolean isOrdered;

    public OrderDto(User user, boolean isRented) {
        this.user = user;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public boolean isRented() {
        return isOrdered;
    }
}

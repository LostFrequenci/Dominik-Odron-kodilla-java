package com.kodilla.good.patterns.challenges.Food2Door_v2;

public class ProducentOffertDto {

    public Producer producer;
    public Product product;

    public ProducentOffertDto(final Producer producer,final Product product) {
        this.producer = producer;
        this.product = product;
    }

    public Producer getProducer() {
        return producer;
    }

    public Product getProduct() {
        return product;
    }
}

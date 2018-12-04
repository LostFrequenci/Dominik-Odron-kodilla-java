package com.kodilla.good.patterns.challenges.Food2Door_v2;

public class Product {

    public String productName;
    public int productQuantity;

    public Product(String productName, int productQuantity) {
        this.productName = productName;
        this.productQuantity = productQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    @Override
    public String toString() {
        return "Product Name : '" + productName + '\'' +
                ", product quantity : " + productQuantity;
    }
}

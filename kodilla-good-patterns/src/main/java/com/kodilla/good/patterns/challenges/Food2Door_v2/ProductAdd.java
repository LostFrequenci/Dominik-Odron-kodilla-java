package com.kodilla.good.patterns.challenges.Food2Door_v2;

import java.util.Scanner;

public class ProductAdd {

    public Product productRetrieve(){

        String productName;
        int productQuantity;

        System.out.print("Please, type name of product : ");
        Scanner read = new Scanner(System.in);
        productName = read.nextLine();

        System.out.println("");
        System.out.print("Please, type quantity of producer : ");
        Scanner read1 = new Scanner(System.in);
        productQuantity = read1.nextInt();

        Product product = new Product(productName,productQuantity);
        return product;
    }
}

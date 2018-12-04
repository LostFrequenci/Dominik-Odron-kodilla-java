package com.kodilla.good.patterns.challenges.Food2Door_v2;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        int loopMarker = 0;
        int loopCounter = 0;
        ProducerAdd producerAdd = new ProducerAdd();
        ProductAdd productAdd = new ProductAdd();

        do {
            System.out.println("Main menu");
            System.out.println("1. Add new producer");
            System.out.println("2. Add new shop");
            System.out.println("3. End program");
            System.out.print("Choose option : ");

            Scanner read = new Scanner(System.in);
            loopMarker = read.nextInt();

            switch (loopMarker) {
                case 1:
                    Producer producer1 = producerAdd.producerRetrieve();
                    System.out.println(producer1);

                    Product product1 = productAdd.productRetrieve();
                    System.out.println(product1);
                case 2:
                    System.out.println("Shop add");
                case 3:
                    loopMarker = 0;

            }



        } while (loopMarker !=0);

        System.out.println("Program end...");

        //OrderRetriever orderRetriever = new OrderRetriever();
        //Order order1 = orderRetriever.retrieve();

        //ProductOrderService productOrderService = new ProductOrderService(new InformationService(),new OrderService(),new OrderRepository());
        //productOrderService.process(order1);

    }
}


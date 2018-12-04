package com.kodilla.good.patterns.challenges.Food2Door_v2;

import java.util.Scanner;

public class ProducerAdd {

    public Producer producerRetrieve(){

        String producerName;
        String producerAddress;
        String producerMail;
        String producerPhone;

        System.out.print("Please, type name of producer : ");
        Scanner read = new Scanner(System.in);
        producerName = read.nextLine();

        System.out.println("");
        System.out.print("Please, type address of producer : ");
        Scanner read1 = new Scanner(System.in);
        producerAddress = read1.nextLine();

        System.out.println("");
        System.out.print("Please, type mail of producer : ");
        Scanner read2 = new Scanner(System.in);
        producerMail = read2.nextLine();

        System.out.println("");
        System.out.print("Please, type phone number of producer : ");
        Scanner read3 = new Scanner(System.in);
        producerPhone = read3.nextLine();

        Producer producer = new Producer(producerName,producerAddress,producerMail,producerPhone);
        return producer;


    }
}

package com.kodilla.good.patterns.challenges.Food2Door_v2;

import java.util.Objects;

public class Producer {

    public String producerName;
    public String producerAdrress;
    public String producerMail;
    public String producerPhone;

    public Producer(String producerName, String producerAdress, String producerMail, String producePhone) {
        this.producerName = producerName;
        this.producerAdrress = producerAdress;
        this.producerMail = producerMail;
        this.producerPhone = producePhone;
    }

    public String getProducerName() {
        return producerName;
    }

    public String getProducerAdress() {
        return producerAdrress;
    }

    public String getProducerMail() {
        return producerMail;
    }

    public String getProducerPhone() {
        return producerPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producer)) return false;
        Producer producer = (Producer) o;
        return Objects.equals(getProducerName(), producer.getProducerName()) &&
                Objects.equals(producerAdrress, producer.producerAdrress) &&
                Objects.equals(getProducerMail(), producer.getProducerMail()) &&
                Objects.equals(getProducerPhone(), producer.getProducerPhone());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProducerName(), producerAdrress, getProducerMail(), getProducerPhone());
    }

    @Override
    public String toString() {
        return "Producer Name : '"+ producerName + '\'' +
                ", producer adrress : " + producerAdrress +
                ", producer Mail : " + producerMail +
                ", producer Phone : " + producerPhone;
    }
}

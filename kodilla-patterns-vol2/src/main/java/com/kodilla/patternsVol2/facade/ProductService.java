package com.kodilla.patternsVol2.facade;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Random;

@Service
public class ProductService {
    public BigDecimal getPrice(Long productId){
        Random generaotr = new Random();
        return new BigDecimal(generaotr.nextInt(100000)/100);
    }
}

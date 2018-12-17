package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigMacNew(){
        //Given
        Bigmac bigmac = new Bigmac.BigMacBuilder()
                .bun("With sesame seeds")
                .burgers(2)
                .sauce("Spicy")
                .ingredient("Onion")
                .ingredient("Salad")
                .ingredient("Tomato")
                .ingredient("Cucumber")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        //Then
        Assert.assertEquals(4,howManyIngredients);
        Assert.assertEquals(2,howManyBurgers);
    }
}

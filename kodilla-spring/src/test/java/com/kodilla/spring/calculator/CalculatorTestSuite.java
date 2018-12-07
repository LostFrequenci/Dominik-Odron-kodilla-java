package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result1 = calculator.add(4.0,5.0);
        double result2 = calculator.sub(5.0,4.0);
        double result3 = calculator.mul(4.0,5.0);
        double result4 = calculator.div(4.0,2.0);
        //Then
        Assert.assertEquals(9.0, result1,0.01);
        Assert.assertEquals(1.0, result2,0.01);
        Assert.assertEquals(20.0, result3,0.01);
        Assert.assertEquals(2.0, result4,0.01);
    }
}

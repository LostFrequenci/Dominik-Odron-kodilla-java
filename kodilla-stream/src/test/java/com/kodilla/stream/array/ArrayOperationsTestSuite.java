package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        //Given
        int [] grade = {5,5,5,5,5,4,4,4,4,4};

        //When
        double expectedAverage = 4.5;
        double averageResult = ArrayOperations.getAverage(grade);

        //Then
        Assert.assertEquals(expectedAverage,averageResult,0.01);
    }

    @Test
    public void testGetAverage2(){
        //Given
        int [] grade = {5,5,5,5,3,3,4,4,4,4};

        //When
        double expectedAverage = 4.2;
        double averageResult = ArrayOperations.getAverage(grade);

        //Then
        Assert.assertEquals(expectedAverage,averageResult,0.01);
    }

    @Test
    public void testGetAverage3(){
        //Given
        int [] grade = {1,2,3,4,5,6,7,8,9,10};

        //When
        double expectedAverage = 5.5;
        double averageResult = ArrayOperations.getAverage(grade);

        //Then
        Assert.assertEquals(expectedAverage,averageResult,0.01);
    }
}

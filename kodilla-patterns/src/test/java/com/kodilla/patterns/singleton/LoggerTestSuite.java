package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void loggerTest() {
        //Given
        //When
        Logger.getInstance().log("Log test");
        String result = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals(result,"Log test");
    }
}

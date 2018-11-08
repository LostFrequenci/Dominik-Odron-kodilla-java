package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import com.kodilla.testing.user.SimpleUser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.*;
import java.util.*;
import java.lang.*;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: Begin");
    }
    @After
    public void after() {
        System.out.println("Test Case: End");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        // Given
        ArrayList<Integer> simpleNumber = new ArrayList<Integer>();
        OddNumbersExterminator simpleNumberTest = new OddNumbersExterminator();
        // When
        simpleNumber.add(1);
        simpleNumberTest.exterminate(simpleNumber);
        System.out.println("Testing if the list is empty");
        ArrayList<Integer> evenList = simpleNumberTest.exterminate(simpleNumber);
        // Then
        Assert.assertEquals(0,evenList.size());
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        System.out.println("Testing if the list is sorted correctly");
        ArrayList<Integer> simpleNumber = new ArrayList<Integer>();
        ArrayList<Integer> testingList = new ArrayList<Integer>();
        OddNumbersExterminator simpleNumberTest = new OddNumbersExterminator();

        simpleNumber.addAll(Arrays.asList(1,2,4,7,10,11,15));
        testingList.addAll(Arrays.asList(2,4,10));

        ArrayList<Integer> evenList = simpleNumberTest.exterminate(simpleNumber);
        Assert.assertEquals(evenList,testingList);



    }

}

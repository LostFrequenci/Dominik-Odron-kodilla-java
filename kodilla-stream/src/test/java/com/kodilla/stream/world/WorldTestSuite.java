package com.kodilla.stream.world;

import javafx.beans.binding.When;
import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testWorldPeopleQuantity() {

        //Given
        //Preparation of the list of countries
        Country country1 = new Country(new BigDecimal("1000000000"));
        Country country2 = new Country(new BigDecimal("1000000001"));
        Country country3 = new Country(new BigDecimal("1000000002"));
        Country country4 = new Country(new BigDecimal("1000000003"));
        Country country5 = new Country(new BigDecimal("1000000004"));
        Country country6 = new Country(new BigDecimal("1000000005"));
        //Preparation of the list of continents
        Continent continent1 = new Continent();
        Continent continent2 = new Continent();

        continent1.addCountry(country1);
        continent1.addCountry(country2);
        continent1.addCountry(country3);
        continent2.addCountry(country4);
        continent2.addCountry(country5);
        continent2.addCountry(country6);
        //Preparation world class
        World testWorld = new World();

        testWorld.addContinent(continent1);
        testWorld.addContinent(continent2);

        //When
        BigDecimal totalPeopleQuantityInTheWorld = testWorld.getPeopleQuantity();

        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("6000000015");
        Assert.assertEquals(expectedPeopleQuantity, totalPeopleQuantityInTheWorld);

    }

    @Test
    public void testContinentsList() {
        //Given
        //Preparation of the list of countries
        Country country1 = new Country(new BigDecimal("1000000000"));
        Country country2 = new Country(new BigDecimal("1000000001"));
        Country country3 = new Country(new BigDecimal("1000000002"));
        Country country4 = new Country(new BigDecimal("1000000003"));
        Country country5 = new Country(new BigDecimal("1000000004"));
        Country country6 = new Country(new BigDecimal("1000000005"));
        //Preparation of the list of continents
        Continent continent3 = new Continent();
        Continent continent4 = new Continent();

        continent3.addCountry(country1);
        continent3.addCountry(country2);
        continent3.addCountry(country3);
        continent4.addCountry(country4);
        continent4.addCountry(country5);
        continent4.addCountry(country6);
        //Preparation world class
        World testWorld = new World();

        testWorld.addContinent(continent3);
        testWorld.addContinent(continent4);

        //When
        int expectedSize = testWorld.getContinents().size();

        //Then
        Assert.assertEquals(expectedSize, 2);


    }

    @Test
    public void testCountriesList() {
        //Given
        //Preparation of the list of countries
        Country country1 = new Country(new BigDecimal("1000000000"));
        Country country2 = new Country(new BigDecimal("1000000001"));
        Country country3 = new Country(new BigDecimal("1000000002"));
        Country country4 = new Country(new BigDecimal("1000000003"));
        Country country5 = new Country(new BigDecimal("1000000004"));
        Country country6 = new Country(new BigDecimal("1000000005"));
        //Preparation of the list of continents
        Continent continent3 = new Continent();
        Continent continent4 = new Continent();

        continent3.addCountry(country1);
        continent3.addCountry(country2);
        continent3.addCountry(country3);
        continent4.addCountry(country4);
        continent4.addCountry(country5);
        continent4.addCountry(country6);

        //When
        int expectedSize = continent3.getCountries().size();

        //Then
        Assert.assertEquals(expectedSize, 3);


    }


}

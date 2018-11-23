package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Continent {
    private List<Country> countries=new ArrayList<>();
    //BigDecimal getPeopleQuantity();
    public void addCountry(Country country)
    {
        countries.add(country);
    }

    public List<Country> getCountries() {
        return countries;
    }
}

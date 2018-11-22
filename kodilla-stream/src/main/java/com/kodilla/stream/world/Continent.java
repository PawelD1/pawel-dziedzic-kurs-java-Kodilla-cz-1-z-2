package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public interface Continent {
    List<Country> countryOfContinent=new ArrayList<>();
    BigDecimal getPeopleQuantity();

}

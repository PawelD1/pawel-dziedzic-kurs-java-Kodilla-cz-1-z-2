package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Europe// implements Continent
{
    private List<Country> countriesOfEurope = new ArrayList<Country>();

    public List<Country> getCountriesOfEurope() {
        return countriesOfEurope;
    }

    public Europe()
    {
        countriesOfEurope.add(new Country("Polska",new BigDecimal("38000000")));
        countriesOfEurope.add(new Country("Niemcy",new BigDecimal("84000000")));
        countriesOfEurope.add(new Country("Ukraina",new BigDecimal("53589900")));
        countriesOfEurope.add(new Country("Francja",new BigDecimal("70050000")));
    }
    public List<BigDecimal> getPeopleQuantityOfEurope()
    {
        return countriesOfEurope.stream()
                .map(e->e.getPeopleQuantity())
                .collect(Collectors.toList());
    }
//    public List<Country> getEurope() {
//        return Europe;
//    }
//
//    public List<Country> getAfrica() {
//        return Africa;
//    }
//
//    public List<Country> getAsia() {
//        return Asia;
//    }
//
//    public List<Country> getAmericaN() {
//        return AmericaN;
//    }
//
//    public List<Country> getAmericaS() {
//        return AmericaS;
//    }
}

package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Asia
{
    private List<Country> countriesOfAsia = new ArrayList<Country>();

    public List<Country> getCountriesOfAsia() {
        return countriesOfAsia;
    }

    public Asia()
    {
        countriesOfAsia.add(new Country("Chiny",new BigDecimal("1038000000")));
        countriesOfAsia.add(new Country("Indie",new BigDecimal("1102000000")));
        countriesOfAsia.add(new Country("Turcja",new BigDecimal("53589900")));
        countriesOfAsia.add(new Country("Jemen",new BigDecimal("20050000")));
    }
//    public List<BigDecimal> getPeopleQuantityOfEurope()
//    {
//        return countriesOfAsia.stream()
//                .map(a->a.getPeopleQuantity())
//                .collect(Collectors.toList());
//    }
}

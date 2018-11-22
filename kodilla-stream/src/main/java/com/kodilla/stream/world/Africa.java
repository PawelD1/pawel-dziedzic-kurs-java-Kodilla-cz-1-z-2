package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Africa
{
    private List<Country> countriesOfAfrica = new ArrayList<Country>();

    public List<Country> getCountriesOfAfrica() {
        return countriesOfAfrica;
    }

    public Africa()
    {
        countriesOfAfrica.add(new Country("Egipt",new BigDecimal("88000000")));
        countriesOfAfrica.add(new Country("Maroko",new BigDecimal("30000500")));
        countriesOfAfrica.add(new Country("Kongo",new BigDecimal("90000700")));
        countriesOfAfrica.add(new Country("RPA",new BigDecimal("60090000")));

    }
//    public List<BigDecimal> getPeopleQuantityOfEurope()
//    {
//        return countriesOfAfrica.stream()
//                .map(af->af.getPeopleQuantity())
//                .collect(Collectors.toList());
//    }

}

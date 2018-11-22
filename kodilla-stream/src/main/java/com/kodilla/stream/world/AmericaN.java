package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AmericaN
{
    private List<Country> countriesOfAmericaN = new ArrayList<Country>();

    public AmericaN()
    {
        countriesOfAmericaN.add(new Country("USA",new BigDecimal("438000000")));
        countriesOfAmericaN.add(new Country("Kanada",new BigDecimal("24000000")));
        countriesOfAmericaN.add(new Country("Meksyk",new BigDecimal("53589900")));
    }
    public List<Country> getCountriesOfAmericaN() {
        return countriesOfAmericaN;
    }
//    public List<BigDecimal> getPeopleQuantityOfEurope()
//    {
//        return countriesOfAmericaN.stream()
//                .map(an->an.getPeopleQuantity())
//                .collect(Collectors.toList());
  //  }

}

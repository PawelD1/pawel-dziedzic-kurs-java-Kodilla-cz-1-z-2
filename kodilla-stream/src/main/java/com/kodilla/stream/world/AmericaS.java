package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AmericaS
{
    private List<Country> countriesOfAmericaS = new ArrayList<Country>();

    public List<Country> getCountriesOfAmericaS() {
        return countriesOfAmericaS;
    }

    public AmericaS()
    {
        countriesOfAmericaS.add(new Country("Brazylia",new BigDecimal("238000000")));
        countriesOfAmericaS.add(new Country("Kolumbia",new BigDecimal("84200000")));
        countriesOfAmericaS.add(new Country("Chile",new BigDecimal("33589900")));
        countriesOfAmericaS.add(new Country("Argentyna",new BigDecimal("30050000")));
    }
//    public List<BigDecimal> getPeopleQuantityOfEurope()
//    {
//        return countriesOfAmericaS.stream()
//                .map(as->as.getPeopleQuantity())
//                .collect(Collectors.toList());
//    }

}

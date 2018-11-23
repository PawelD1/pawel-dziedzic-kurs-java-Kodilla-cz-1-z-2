package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class World {
    private List<Continent> continents = new ArrayList<>();

    public void addContinent(Continent continent) {
        continents.add(continent);
    }

    public List<Continent> getContinents() {
        return continents;
    }

    public BigDecimal getPeopleQuantityOfWorld() {
        return continents.stream()
                .flatMap(countryOfContinents -> countryOfContinents.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));


    }
}
//    public BigDecimal addingEverythingPopulation()
//    {
//        ArrayList<BigDecimal> all=getPeopleQuantityOfWorld();
//        int n=all.size();
//        BigDecimal sum=new BigDecimal("0");
//        for(int i=0;i<n;i++)
//        {
//            sum=sum.add(all.get(i));
//
//        }
//        return sum;
//
//    }

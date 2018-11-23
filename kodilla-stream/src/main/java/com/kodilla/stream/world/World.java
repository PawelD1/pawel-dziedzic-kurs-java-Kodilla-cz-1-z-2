package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class World
{
    private List<Continent>continents=new ArrayList<>();
    public void addContinent(Continent continent)
    {
        continents.add(continent);
    }

    public List<Continent> getContinents() {
        return continents;
    }
    public ArrayList <BigDecimal> getPeopleQuantityOfWorld()
    {
        return (ArrayList<BigDecimal>) continents.stream()
                .flatMap(countryOfContinents-> countryOfContinents.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .collect(Collectors.toList());
    }
    public BigDecimal addingEverythingPopulation()
    {
        ArrayList<BigDecimal> all=getPeopleQuantityOfWorld();
        int n=all.size();
        BigDecimal sum=new BigDecimal("0");
        for(int i=0;i<n;i++)
        {
            sum=sum.add(all.get(i));

        }
        return sum;

    }


}














//    private List<Country> c=new ArrayList<>();
  //  private List<Continent> c=new ArrayList<>();


    // public List<Country> addEverything(List<Country>countries)
//    {
//        List<Country> countryOfWorld=new ArrayList<Country>() ;
//        countryOfWorld.add(c)
//    }
//    public World() {
//        c.add(new Europe());
//        c.add(new Asia());
//        c.add(new AmericaN());
//        c.add(new AmericaS());
//        c.add(new Africa());
//  }
//    BigDecimal getPeopleQunatity()
//    {
//        BigDecimal bg=new BigDecimal("21134567");
//        return  c.stream()
//                .flatMap(c->c.getPeopleQuantity().stre)
//    }


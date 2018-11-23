package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite
{
    @Test
    public void  testGetPeopleQuantity()
    {
       World world=new World();

       Continent europa=new Continent();
       Country polska=new Country(BigDecimal.valueOf(40000000));
       Country niemcy=new Country(new BigDecimal(85000000));
       Country francja=new Country(new BigDecimal(75000000));
       europa.addCountry(polska);
       europa.addCountry(niemcy);
       europa.addCountry(francja);
       world.addContinent(europa);

       Continent afryka=new Continent();
       Country egipt=new Country(BigDecimal.valueOf(75000000));
       Country nigeria=new Country(new BigDecimal(60000000));
       Country rpa=new Country(new BigDecimal(45000000));
       afryka.addCountry(egipt);
       afryka.addCountry(nigeria);
       afryka.addCountry(rpa);
       world.addContinent(afryka);

       Continent azja=new Continent();
       Country chiny=new Country(BigDecimal.valueOf(1000000000));
       Country indie=new Country(new BigDecimal(800000000));
       Country turcja=new Country(new BigDecimal(45000000));
       azja.addCountry(chiny);
       azja.addCountry(indie);
       azja.addCountry(turcja);
       world.addContinent(azja);
       BigDecimal bg= new BigDecimal("2225000000");
       Assert.assertEquals(bg,world.getPeopleQuantityOfWorld());

    }

}

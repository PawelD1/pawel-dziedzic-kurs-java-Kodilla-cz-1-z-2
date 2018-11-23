package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country
{
    private  BigDecimal peopleQuantity;
    public Country(BigDecimal population)
    {

        this.peopleQuantity=population;
    }
    public  BigDecimal getPeopleQuantity()
    {
        return peopleQuantity;
    }
}
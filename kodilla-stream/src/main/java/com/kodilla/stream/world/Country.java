package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country
{
    private String name;
    private static BigDecimal peopleQuantity;
    public Country(String name, BigDecimal population)
    {
        this.name=name;
        this.peopleQuantity=peopleQuantity;
    }
    public static BigDecimal getPeopleQuantity()
    {
        return peopleQuantity;
    }
}
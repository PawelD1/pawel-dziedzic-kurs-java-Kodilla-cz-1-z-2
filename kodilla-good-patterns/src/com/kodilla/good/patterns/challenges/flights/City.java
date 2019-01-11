package com.kodilla.good.patterns.challenges.flights;

public class City
{
    private String nameOfCity;

    public String getNameOfCity() {
        return nameOfCity;
    }

    public City(String nameOfCity) {
        this.nameOfCity = nameOfCity;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City c = (City) o;
        return c.equals(nameOfCity);
    }
    @Override
    public int hashCode() {
        return nameOfCity.hashCode();
    }
}
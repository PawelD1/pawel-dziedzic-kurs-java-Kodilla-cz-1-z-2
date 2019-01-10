package com.kodilla.good.patterns.challenges.flights;

public class Flight
{
    private String destinationCity;
    private String startCity;
    public Flight(String destinationCity, String startCity)
    {
            this.destinationCity=destinationCity;
            this.startCity=startCity;
    }
    public  String getDestinationCity()
    {
        return destinationCity;
    }
    public String getStartCity()
    {
        return startCity;
    }

}

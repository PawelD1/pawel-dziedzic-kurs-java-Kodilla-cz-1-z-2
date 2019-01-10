package com.kodilla.good.patterns.challenges.flights;

public class MainFlights
{
    public static void main(String [] args)//Warszawa-Kraków Kraków-Gdansk
    {
        StartCity sc=new StartCity("Gdańsk");
        FlightProcessor fp=new FlightProcessor();
        fp.findingFlightsFrom(sc.getFirstCity());


    }
}

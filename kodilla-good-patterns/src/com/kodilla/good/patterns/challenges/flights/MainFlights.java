package com.kodilla.good.patterns.challenges.flights;

import java.util.Set;

public class MainFlights
{
    public static void main(String [] args)//Warszawa-Kraków Kraków-Gdansk
    {
        City c1=new City("Gdańsk");
        FlightProcessor fp=new FlightProcessor();
        Set<Flight>flight;
        flight=fp.findingFlightsFrom(c1.getNameOfCity());
        System.out.println(fp.StringAllFlightsFrom(flight));

        City c2=new City("Rzeszów");
        flight=fp.findingFlightsTo(c2.getNameOfCity());
        System.out.println(fp.StringAllFlightsTo(flight));

        City startCity=new City("Gdańsk");
        City indirectCity=new City("Kraków");
        City destinationCity=new City("Wrocław");
        flight=fp.findingIndirectFlights(startCity.getNameOfCity(),indirectCity.getNameOfCity(),destinationCity.getNameOfCity());
        System.out.println(fp.StringIndirectFlights(flight));

    }
}

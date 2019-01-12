package com.kodilla.good.patterns.challenges.flights;

import java.util.Set;

public class MainFlights {
    public static void main(String[] args) {
        City c1 = new City("Gdańsk");
        FlightProcessor fp = new FlightProcessor();
        Set<Flight> flight;
        flight = fp.findingFlightsFrom(c1.getNameOfCity());
        System.out.println(fp.StringAllFlightsFrom(flight));

        City c2 = new City("Rzeszów");
        flight = fp.findingFlightsTo(c2.getNameOfCity());
        System.out.println(fp.StringAllFlightsTo(flight));

        City startCity = new City("Gdańsk");
        City finalCity = new City("Wrocław");
        String isFlightPossible="";
        isFlightPossible+=fp.findingIndirectFlights(startCity.getNameOfCity(),finalCity.getNameOfCity());
        System.out.println(isFlightPossible);




    }
}




        //City destinationCity=new City("Wrocław");
//        flight=fp.findingIndirectFlights1(startCity.getNameOfCity(),indirectCity.getNameOfCity());
//        Set<Flight>flight2;
//        flight2=fp.findingIndirectFlights2(indirectCity.getNameOfCity(),destinationCity.getNameOfCity());
//        System.out.println(fp.StringIndirectFlights(flight,flight2));




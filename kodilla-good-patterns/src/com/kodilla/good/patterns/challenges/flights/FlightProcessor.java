package com.kodilla.good.patterns.challenges.flights;


import java.util.*;
import java.util.stream.Collectors;

public class FlightProcessor {
    private static Set<Flight> listOfFlightsToLookingFor = new HashSet<>();
    static {
        for (Flight singleFlight : FlightFinder.getCities()) {
            listOfFlightsToLookingFor.add(singleFlight);
        }
    }
    public Set<Flight> findingFlightsFrom(String firstCity) {
        Set<Flight> allFlightsFrom = listOfFlightsToLookingFor;
        allFlightsFrom = listOfFlightsToLookingFor.stream()
                .filter(s -> s.getStartCity().equals(firstCity))
                .collect(Collectors.toSet());
        return allFlightsFrom;
    }
    public String StringAllFlightsFrom(Set<Flight> allFlightsFrom) {
        String s = "";
        for (Flight flight : allFlightsFrom) {

            s += "Flight from " + flight.getStartCity() + " to " + flight.getDestinationCity() + ".\n";
        }
        return s;
    }
    public Set<Flight> findingFlightsTo(String finalCity) {
        Set<Flight> allFlightsTo = listOfFlightsToLookingFor;
        allFlightsTo = listOfFlightsToLookingFor.stream()
                .filter(s -> s.getDestinationCity().equals(finalCity))
                .collect(Collectors.toSet());
        return allFlightsTo;
    }
    public String StringAllFlightsTo(Set<Flight> allFlightsTo) {
        String s = "";
        for (Flight flight : allFlightsTo) {

            s += "Flight to " + flight.getDestinationCity() + " from " + flight.getStartCity() + ".\n";
        }
        return s;
    }
    public Set<Flight> findingIndirectFlights1(String firstCity, String indirectCity)
    {
        Set<Flight> indirectFlightsFrom = listOfFlightsToLookingFor;
        indirectFlightsFrom = listOfFlightsToLookingFor.stream()
                .filter(m -> m.getDestinationCity().equals(indirectCity))
                .filter(s -> s.getStartCity().equals(firstCity))
                .collect(Collectors.toSet());
        return indirectFlightsFrom;
    }
    public Set<Flight> findingIndirectFlights2(String indirectCity,String finalCity)
    {
        Set<Flight> indirectFlightsTo = listOfFlightsToLookingFor;
        indirectFlightsTo = listOfFlightsToLookingFor.stream()
                .filter(m -> m.getStartCity().equals(indirectCity))
                .filter(m -> m.getDestinationCity().equals(finalCity))
                .collect(Collectors.toSet());
        return indirectFlightsTo;
    }
    public String StringIndirectFlights(Set<Flight> indirectFlightsFrom, Set<Flight>indirectFlightsTo)
    {
        String s="";
        for (Flight flight : indirectFlightsFrom)
        {
            for(Flight flight2:indirectFlightsTo)
            {
                s += "Indirect Flight to " + flight2.getDestinationCity() + " from " + flight.getStartCity() +" is possible with change the airport. You must stop in "+flight.getDestinationCity()+" and then you may fly to "+flight2.getDestinationCity()+ ".\n";
            }
        }
        return s;
    }
}







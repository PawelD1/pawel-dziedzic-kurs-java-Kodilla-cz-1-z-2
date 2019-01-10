package com.kodilla.good.patterns.challenges.flights;

import java.util.*;
import java.util.stream.Collectors;

public class FlightFinder
{
    private static Map<String,String> flights=new HashMap<>();
    static
    {

        flights.put("Kraków","Gdańsk");
        flights.put("Wrocław","Kraków");
        flights.put("Rzeszów", "Kraków");
        flights.put("Lublin","Rzeszów");
        flights.put("Gdańsk","Lublin");
        flights.put("Warszawa","Gdańsk")

    }
    public static Set<String> getDestinationCity()
    {
        return flights.keySet();
    }
    public static Collection<String> getStartCity()
    {
        return flights.values();
    }
    public Map<String,String> findingFlightsFrom(String city)
    {
        Map<String,String> startCity;

        startCity=flights.entrySet().stream()
                .map(entry->entry.getValue())
                .filter(s->s.equals(city))
                .collect(Collectors.toMap(FlightFinder::///???));



    }
}

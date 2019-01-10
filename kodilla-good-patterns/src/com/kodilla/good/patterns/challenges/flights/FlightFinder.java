package com.kodilla.good.patterns.challenges.flights;

import java.util.*;
import java.util.stream.Collectors;

public class FlightFinder {
//    private String destinationCity;
    private String startCity;
//    public FlightFinder(String destinationCity, String startCity)
//    {
//            this.destinationCity=destinationCity;
//            this.startCity=startCity;
//    }

    private static Set<Flight> singleFlight = new HashSet<>();

    static {
        singleFlight.add(new Flight("Kraków", "Gdańsk"));
        singleFlight.add(new Flight("Wrocław", "Kraków"));
        singleFlight.add(new Flight("Rzeszów", "Kraków"));
        singleFlight.add(new Flight("Lublin", "Rzeszów"));
        singleFlight.add(new Flight("Gdańsk", "Lublin"));
        singleFlight.add(new Flight("Warszawa", "Gdańsk"));
    }
    public static Set<Flight>getCities()
    {
        return singleFlight;
    }
    public String getStartCity()
    {
        return startCity;
    }
}


//    }
//    public  String getDestinationCity()
//    {
//        return destinationCity;
//    }

//    public void findingFlightsFrom(String city)
//    {
//        Set<FlightFinder> singleFlight=flights;
//
//        singleFlight.stream()
//                .filter(s->s.startCity.equals(city))
//                .forEach(System.out::println);
//    }
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof FlightFinder)) return false;
//        FlightFinder flightFinder = (FlightFinder) o;
//        return startCity.equals(flightFinder.startCity);
//    }
//    @Override
//    public int hashCode() {
//        return startCity.hashCode();
//    }
//}

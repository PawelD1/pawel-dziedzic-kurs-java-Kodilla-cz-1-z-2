package com.kodilla.good.patterns.challenges.flights;

import java.util.*;

public class FlightFinder {
    private static Set<Flight> singleFlight = new HashSet<>();
    static {
        singleFlight.add(new Flight("Kraków", "Gdańsk"));
        singleFlight.add(new Flight("Wrocław", "Kraków"));
        singleFlight.add(new Flight("Rzeszów", "Kraków"));
        singleFlight.add(new Flight("Lublin", "Rzeszów"));
        singleFlight.add(new Flight("Gdańsk", "Lublin"));
        singleFlight.add(new Flight("Warszawa", "Gdańsk"));
        singleFlight.add(new Flight("Rzeszów","Warszawa"));


    }
    public static Set<Flight>getCities()
    {
        return singleFlight;
    }
}


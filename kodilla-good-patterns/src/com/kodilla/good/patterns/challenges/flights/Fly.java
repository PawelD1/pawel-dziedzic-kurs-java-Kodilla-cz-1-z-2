package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Fly
{
    private String startingCity;
    private String destinationCity;
    private ArrayList<String>flightBetweenTwoCities=new ArrayList<>();
    //klaa FlightFinder wypelnic jak extrafodd shop

    public String getStartingCity() {
        return startingCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public ArrayList<String> getFlightBetweenTwoCities() {
        return flightBetweenTwoCities;
    }

    public Fly(String startingCity, String destinationCity) {
        this.startingCity=startingCity;
        this.destinationCity=destinationCity;
    }


    public void addCity(String city) {
        flightBetweenTwoCities.add(city);
    }

    public boolean removeCity(String city) {
        return flightBetweenTwoCities.remove(city);
    }







    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fly)) return false;
        Fly fly = (Fly) o;
        return startingCity.equals(fly.startingCity);
    }
    @Override
    public int hashCode() {
        return startingCity.hashCode();
    }
//    public List<String> findFlightsFromTheCity()
////    {
////        //return Fly.getStartingCity.stream();
////        flightBetweenTwoCities().stream()
////                .map(fly->fly.startingCity);
////        return flightBetweenTwoCities
////    }
    //JAK ZNALEŹĆ LOTY POPRZEZ INNE MIASTO
}


package com.kodilla.good.patterns.challenges.flights;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FlightProcessor
{
    private static Set<FlightFinder> listOfFlightsToLookingFor=new HashSet<>();
    static{
        for(Flight singleFlight:FlightFinder.getCities())
        {
            listOfFlightsToLookingFor.add(new FlightFinder());
        }
    }

    public void findingFlightsFrom(String firstCity)
    {
        //Set<FlightFinder> singleFlight=listOfFlightsToLookingFor;
        listOfFlightsToLookingFor.stream()
                .filter(s->s.getStartCity().equals(firstCity))
                .forEach(System.out::println);
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof FlightProcessor)) return false;
//        FlightProcessor fp = (FlightProcessor) o;
//        return fp.equals(startCity.firstCity);
//    }
//    @Override
//    public int hashCode() {
//        return startCity.hashCode();
//    }
//}

}

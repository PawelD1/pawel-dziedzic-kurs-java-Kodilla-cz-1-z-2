package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindingFlights
{
    public void findFlight(Flight flight)
    {
        Map<String,Boolean> flightIsPossible=new HashMap<>();
        flightIsPossible.put("Warszawa",true);
        flightIsPossible.put("Berlin",true);
        flightIsPossible.put("Rzeszów",true);
        flightIsPossible.put("Paryż",true);
        flightIsPossible.put("Moskwa",false);
        flightIsPossible.put("Kijów",false);
        Set<String> keysSet=flightIsPossible.keySet();
        //Set<String> flights=new Set<String>();//flight.getArrivalAirport();
        for(int i=0;i<flightIsPossible.size();i++)
        {
           // if(flight.getArrivalAirport()==keysSet

        }
//        for(Map.Entry<String, Boolean> entry: flightIsPossible) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }


    }
}

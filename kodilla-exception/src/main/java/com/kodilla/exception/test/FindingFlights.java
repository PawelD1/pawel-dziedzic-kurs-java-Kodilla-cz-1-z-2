package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindingFlights
{
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightIsPossible = new HashMap<>();
        flightIsPossible.put("Warszawa", true);
        flightIsPossible.put("Berlin", true);
        flightIsPossible.put("Rzeszów", true);
        flightIsPossible.put("Paryż", true);
        flightIsPossible.put("Moskwa", false);
        flightIsPossible.put("Kijów", false);
        Boolean exist=flightIsPossible.get(flight.getArrivalAirport());
        if(exist==null) {
            throw new RouteNotFoundException("This flight is unavailable");
        }
        else if(!exist) {
            throw new RouteNotFoundException("From this place flight is unavailable");
        }
        System.out.println("The passenger from " + flight.getDepartureAirport() + " is flying to " +exist);
//



//        for (Map.Entry<String, Boolean> entry : flightIsPossible.entrySet()) {
//            if (entry.getKey() == flight.getArrivalAirport() && entry.getValue()) {
//                System.out.println("The passenger from " + flight.getDepartureAirport() + " is flying to " +
//                        entry.getKey());
//                i=i+1;
//                break;
//            } else if (entry.getKey() == flight.getArrivalAirport() && !entry.getValue()) {
//                System.out.println("The passenger from " + flight.getDepartureAirport() + " can't fly to " +
//                        entry.getKey());
//                i=i+1;
//                break;
//
//           } else if(i==flightIsPossible.size()-1&& entry.getKey()!=flight.getArrivalAirport()) {
//              throw new RouteNotFoundException("This flight is unavailable");
//           }



    }
}


package com.kodilla.exception.test;

public class Main
{
    public static void main(String args[]) throws RouteNotFoundException {
        Flight flight=new Flight("Kraków","Warszawa");
        Flight flight2=new Flight("Rzeszów","Nowy Jork");
        Flight flight3=new Flight("Wrocław","Waszyngton");
        Flight flight4=new Flight("Wrocław","Moskwa");
        FindingFlights findingFlights=new FindingFlights();
        try{
            findingFlights.findFlight(flight);
        }
        catch(RouteNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            findingFlights.findFlight(flight2);
        }
        catch(RouteNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        try{
            findingFlights.findFlight(flight3);
        }catch(RouteNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            findingFlights.findFlight(flight4);
        }catch(RouteNotFoundException e){
            System.out.println(e.getMessage());
        }



    }

}

package com.kodilla.good.patterns.challenges.flights;

public class MainFlights
{
    public static void main(String [] args)//Warszawa-Kraków Kraków-Gdansk
    {
        Fly f1 = new Fly("Gdańsk", "Wrocław");
        f1.addCity("Warszawa");
        f1.addCity("Rzeszów");
        f1.addCity("Kraków");
        f1.addCity("Katowice");
        f1.removeCity("Katowice");
        Fly f2 = new Fly("Szczecin", "Lublin");
        f2.addCity("Gdańsk");
        f2.addCity("Toruń");
        f2.addCity("Kielce");
        Fly f3 = new Fly("Olsztyn", "Opole");
        f3.addCity("Warszawa");
        f3.addCity("Łódź");
        f3.addCity("Katowice");
        Fly f4 = new Fly("Gdańsk", "Białystok");
        f4.addCity("Warszawa");
        f4.addCity("Olsztyn");
        Fly f5 = new Fly("Szczecin", "Wrocław");
        f5.addCity("Gorzów Wlkp");
        f5.addCity("Zielona Góra");
        Fly f6 = new Fly("Opole", "Lublin");
        f6.addCity("Łódź");
        f6.addCity("Kielce");


    }
}

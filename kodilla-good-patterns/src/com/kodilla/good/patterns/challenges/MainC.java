package com.kodilla.good.patterns.challenges;
import java.awt.print.Book;
import java.util.*;
import java.util.stream.*;
public class MainC
{
    public static void main(String [] args)
    {
        MovieStore ms=new MovieStore();
       Map<String, List<String>> titles=new HashMap<>();
        titles=ms.getMovies();
        Map<String, List<String>> theResultMapOfMovie= titles;
        String allOfTitles;
         System.out.println("PIERWSZY SPOSÓB- nie działa collect wiadomo dlaczego");
        titles.entrySet().stream()
                        .map(s -> s+"!")
                .collect(Collectors.joining("!","",""));
        System.out.println(titles);
        System.out.println("\nDRUGI SPOSÓB");
        allOfTitles=theResultMapOfMovie.entrySet().stream()
                        .map(entry -> entry.getKey()+": " + entry.getValue())
                       .collect(Collectors.joining("!","",""));
        System.out.println(allOfTitles);
        System.out.println("\nTRZECI SPOSÓB");
        allOfTitles=theResultMapOfMovie.entrySet().stream()
                .map(entry -> ""+entry.getValue())
                .collect(Collectors.joining("!","",""));
        System.out.println(allOfTitles);
        System.out.println("\nCZWARTY SPOSÓB z map, wykrzyknik również na końcu");
        theResultMapOfMovie.values().stream()
                .map(s->s+"!")
                .forEach(System.out::print);
            }
        }




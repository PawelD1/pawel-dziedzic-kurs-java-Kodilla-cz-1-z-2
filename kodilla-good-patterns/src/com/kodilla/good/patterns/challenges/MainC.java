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
        System.out.println("PIERWSZY SPOSÓB");
        titles.entrySet().stream()
                        .map(s -> s+"!")
                .collect(Collectors.joining("!","",""));
        System.out.println(titles);
        System.out.println("\nDRUGI SPOSÓB");
                theResultMapOfMovie.entrySet().stream()
                        .map(entry -> entry.getKey() + ": " + entry.getValue())
                        .collect(Collectors.joining("!","",""));
         System.out.println(theResultMapOfMovie);
        System.out.println("\nTRZECI SPOSÓB");
        theResultMapOfMovie.keySet().stream()
            .map(s->s+"!")
            .forEach(System.out::print);
        theResultMapOfMovie.values().stream()
                .map(s->s+"!")
                .forEach(System.out::print);
        System.out.println("\nCZWARTY SPOSÓB");
        theResultMapOfMovie.values().stream()
                .map(s->s+"!")
                .forEach(System.out::print);

            }
        }




package com.kodilla.good.patterns.challenges;
import java.awt.print.Book;
import java.util.*;
import java.util.stream.*;
public class MainC
{
    public static void main(String [] args)
    {
        MovieStore ms=new MovieStore();
       // Map<String, List<String>> titles=new HashMap<>();
       // titles=ms.getMovies();
       // Map<String, List<String>> allTitles = new HashMap<String, List<String>>();
        //ms.getMovies().stream()
        Map<String, List<String>> theResultMapOfMovie= ms.getMap().stream()
                        .map(s -> s+"!")
                         .forEach(System.out::println);
                theResultMapOfMovie.entrySet().stream()
                        .map(entry -> entry.getKey() + ": " + entry.getValue())
                        .map(s->s+"!")
                        .forEach(System.out::println);
            }
        }




package com.kodilla.exception.test;

public class RouteNotFoundException extends java.lang.Exception {
   public RouteNotFoundException(final String message)
   {
       //nic przed super
       super(message); //nie działa super :(
   }
}

package com.kodilla.exception.test;

public class RouteNotFoundException extends java.lang.Exception {
   public RouteNotFoundException(final String message)
   {
       //nic przed super nie może być bo nie zadziałą
       super(message);
   }
}



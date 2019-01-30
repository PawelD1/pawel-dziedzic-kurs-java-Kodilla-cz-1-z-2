package com.kodilla.exception.test;

public class ExceptionHandling
{
    public static void main(String args[]) throws Exception {
        SecondChallenge secondChallenge=new SecondChallenge();
        try
        {
            secondChallenge.probablyIWillThrowException(2, 1.5);
        }catch(Exception e)
        {
            System.out.println("Incorrect numerical values.");
        }finally
        {
            System.out.println("This will always be displayed.");
        }

    }
}



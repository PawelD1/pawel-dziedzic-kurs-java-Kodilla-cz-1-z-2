package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class Display
{
    void displayValue(double val)
    {
        if(val==0)
        {
            System.out.println("You can not divide by zero.");
        }
        else
            System.out.println(val);
    }
}

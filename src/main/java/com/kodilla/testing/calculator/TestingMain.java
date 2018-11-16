package com.kodilla.testing.calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int result1 = c.add(7, 2);
        int result2 = c.subtract(7, 2);
        if ((result1 == 9)&&(result2 == 5))
        {
            System.out.println("Calculator is Ok");
        }
        else
            System.out.println("Calculator is default");


    }
}
package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.taxiportal.TaxiOrder;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {


    @Test
    public void testBasicPizzaOrderWithMoreCheeseAndTuna() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaMoreCheese(theOrder);
        theOrder = new PizzaWithTuna(theOrder);

        //When
        BigDecimal calculatedCost = theOrder.getCost();
        String description = theOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(28), calculatedCost);
        assertEquals("Pizza with tomato sauce and cheese, more cheese with tuna", description);

    }


    @Test
    public void testBasicPizzaOrderWithMoreCheeseAndChicken() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaMoreCheese(theOrder);
        theOrder = new PizzaWithChicken(theOrder);

        //When
        BigDecimal calculatedCost = theOrder.getCost();
        String description = theOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(29), calculatedCost);
        assertEquals("Pizza with tomato sauce and cheese, more cheese with chicken", description);
    }

    @Test
    public void testBasicPizzaOrderWithMoreCheeseAndChickenAndTuna() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaMoreCheese(theOrder);
        theOrder = new PizzaWithChicken(theOrder);
        theOrder = new PizzaWithTuna(theOrder);

        //When
        BigDecimal calculatedCost = theOrder.getCost();
        String description = theOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(37), calculatedCost);
        assertEquals("Pizza with tomato sauce and cheese, more cheese with chicken with tuna", description);
    }

}


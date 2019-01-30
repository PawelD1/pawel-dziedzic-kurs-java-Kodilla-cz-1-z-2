package com.kodilla.good.patterns.challenges.food2Door;

public class MainFood2Door
{
    public static void main(String [] args)
    {
        try {
            Order order1 = new Order("Carrot", 5);
            OrderProcessor op = new OrderProcessor();
            op.process(order1);
            Order order2 = new Order("Cookies", 5);
            op.process(order2);
            Order order3 = new Order("Cookies", 11);
            op.process(order3);
            Order order4 = new Order("Bread", 5);
            op.process(order4);
            Order order5 = new Order("Cheese", 5);
            op.process(order5);
            Order order6=new Order("Crisps",2);
            op.process(order6);
            Order order7 = new Order("Oranges", 5);
            op.process(order7);
        }catch(ShopNotExistException e)
        {
            System.out.println("The next selected product is not available in any shop.");
        }
    }
}

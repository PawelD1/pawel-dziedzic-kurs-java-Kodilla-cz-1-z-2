package com.kodilla.good.patterns.challenges.food2Door;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HealthyShop implements Shop {
    //statyczne nie zależy od obiektu a od klasy
    private static Map<String,Integer> products=new HashMap<>();
    static{//blok statyczny wypiszą sie wartości przed utworzeniem obiektu
        products.put("Carrot",10);
        products.put("Apples",15);
        products.put("Oranges",8);
    }

    public static Set<String> getProductsNames()
    {
        return products.keySet();
    }


    public boolean  info(Order order)
    {
        int amountAfterOrder;
        if(order.getAmount()>products.get(order.getName()))
        {
            System.out.println("The chosen supplier is "+this.getClass().getSimpleName()+" ,but amount "+order.getAmount()+" of "+order.getName()+" is too big.");
            return false;
        }
        else {
            amountAfterOrder = products.get(order.getName()) - order.getAmount();
            products.remove(order.getName());
            products.put(order.getName(), amountAfterOrder);
            System.out.println("The chosen supplier is " + this.getClass().getSimpleName() + " ,which promise to deliver " + order.getAmount() + " " + order.getName());
            return true;
        }
    }
    public void process(Order order)
    {
        if(info(order))
            System.out.println("The  "+order.getAmount()+" pieces of "+order.getName()+" is placed in the shop and ready to send");
    }



}


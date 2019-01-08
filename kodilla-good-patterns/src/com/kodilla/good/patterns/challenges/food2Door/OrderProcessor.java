package com.kodilla.good.patterns.challenges.food2Door;

import java.util.HashMap;
import java.util.Map;

public class OrderProcessor
{
    private static Map<String,Shop> warehouse=new HashMap<>();
    static{
        for(String product:ExtraFoodShop.getProductsNames())
        {
            warehouse.put(product,new ExtraFoodShop());
        }
    }

    private Shop findShop(Order order)
    {
        if(warehouse.containsKey(order.getName()))
        {
            return warehouse.get(order.getName());
        }//ShopNotExistingException
        return null;
    }
    public void process(Order order)
    {
        Shop shop=findShop(order);
        shop.process(order);
        //shop.info
    }
}

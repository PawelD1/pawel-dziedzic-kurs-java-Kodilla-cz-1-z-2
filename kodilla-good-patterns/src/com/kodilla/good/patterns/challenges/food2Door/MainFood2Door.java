package com.kodilla.good.patterns.challenges.food2Door;

import java.util.HashMap;
import java.util.Map;

public class MainFood2Door
{
    private static Map<String,Shop>warehouse=new HashMap<>();
    static{
        for(String product:ExtraFoodShop.getProductsNames())
        {
            warehouse.put(product,new ExtraFoodShop());
        }
    }
    public static void main(String [] args)
    {
        Order order1=new Order("Carrot",5);
        OrderProcessor op=new OrderProcessor();
        op.process(order1);





    }
}

package com.kodilla.good.patterns.challenges.food2Door;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ExtraFoodShop implements Shop//pobieranie z magazynu
{
    //statyczne nie zależy od obiektu a od klasy
    private static Map<String,Integer>products=new HashMap<>();
    static{//blok statyczny wypiszą sie wartości przed utworzeniem obiektu
        products.put("Carrot",10);
    }

    public static Set<String>getProductsNames()
    {
        return products.keySet();
    }


    public void  info(int amount, String kindOfProduct )
    {
        System.out.println("The chosen supplier is "+this.getClass().getSimpleName()+" ,which promise to deliver "+products);
    }
    public void process()
    {
        System.out.println("The  "+amount+" pieces of "+kindOfProduct+" is placed in the shop and ready to send");
    }

    @Override
    public boolean orderIsCompleted(Client client)
    {
        return getName().equals(client.getShop())&&getKindOfProduct().equals(client.getKindOfProduct())&&client.getAmount()<=amount&&client.getAmount()>0;
    }
    public void summary(Client c)
    {
        if (orderIsCompleted(c))
        {
            process();
            this.amount = this.amount - c.getAmount();
        }
        else
            System.out.println("The product " + getKindOfProduct() + " is not available from " + getName() +
                    " or the wrong amount has been chosen, supplier has got " + amount + " you chosen " + c.getAmount());
    }

}

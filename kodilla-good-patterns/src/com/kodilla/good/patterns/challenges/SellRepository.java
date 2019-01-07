package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SellRepository
{
        Map<String,String> add=new HashMap<String, String>();
        void addToRepository(Product product, User user)
        {

            add.put(product.getNameOfProduct(),user.getLastName());
        }
        void showReepository(Map<String,String> add)
        {
            Set<Map.Entry<String, String>> repository = add.entrySet();
            for (Map.Entry<String, String> entry: repository) {
                System.out.println("klucz: " + entry.getKey() + " wartość: " + entry.getValue());
            }
        }
}

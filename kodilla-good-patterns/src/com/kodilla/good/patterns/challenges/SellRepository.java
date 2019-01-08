package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SellRepository
{
        Map<String,String> add=new HashMap<String, String>();
        Map<String,String> addToRepository(Product product, User user)
        {

            add.put(product.getNameOfProduct(),user.getLastName());
            return add;

        }
        void showRepository(Map<String,String> add)
        {
            int nr=0;
            Set<Map.Entry<String, String>> repository = add.entrySet();
            for (Map.Entry<String, String> entry: repository) {
                nr=nr+1;
                System.out.println("ORDER "+nr+":"+" PRODUCT: " + entry.getKey() + ", LAST NAME OF USER: " + entry.getValue()+ " NUMBER OF ORDER: "+nr);
            }
            System.out.println("NOW IN REPOSITORY ARE "+nr+ " ORDERS.");
        }
}

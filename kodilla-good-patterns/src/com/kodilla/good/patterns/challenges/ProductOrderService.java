package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.Map;

public class ProductOrderService {
    public static void main(String args[])
    {
        User user=new User("romek","Roman","Romanowski");
        Product product=new Product("games","Heroes 3",30);
        User user2=new User("maciek","Maciej","Maciowski");
        Product product2=new Product("clothes","T-shirt with image GTAV",40);
        int nr=0;
        Map<String,String> order=new HashMap<String, String>();
        Map<String,String> order2=new HashMap<String, String>();
        InformationService is=new InformationService();
        System.out.println(is.info(user,product));
        System.out.println(is.info(user2,product2));
        SellService ss=new SellService();
        System.out.println(ss.sell(product,user));
        System.out.println(ss.sell(product2,user2));
        SellRepository sr=new SellRepository();
        order=sr.addToRepository(product,user);
        order2=sr.addToRepository(product2,user2);
        sr.showRepository(order);
        SellProcessor sp= new SellProcessor(is, ss,sr);
        //
        SaleDTO sD=new SaleDTO(user,ss.isSold(product,user));
        nr=nr+1;
        SellRequest srq=new SellRequest(product,product,user);
        SellRequest srq2=new SellRequest(product2,product2,user2);
        sD=sp.process(srq);
        sD=sp.process(srq2);
    }
}

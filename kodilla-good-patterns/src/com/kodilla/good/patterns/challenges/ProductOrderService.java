package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    public static void main(String args[])
    {
        User user=new User("romek","Roman","Romanowski");
        Product product=new Product("games","Heroes 3",30);
        InformationService is=new InformationService();
        is.info(user,product);
        SellService ss=new SellService();
        ss.sell(product,user);
        SellRepository sr=new SellRepository();
        sr.addToRepository(product,user);
        SellProcessor sp= new SellProcessor(is, ss,sr);
        SaleDTO sD=new SaleDTO(user,ss.isSold(product,user));
        SellRequest srq=new SellRequest(product,product,user);
        sD=sp.process(srq);
    }
}

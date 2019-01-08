package com.kodilla.good.patterns.challenges.food2Door;

public class MainFood2Door
{
    public static void main(String [] args)
    {
        ExtraFoodShop productEFS1=new ExtraFoodShop(20,"Extra apples","Extra Food Shop");
        ExtraFoodShop productEFS2=new ExtraFoodShop(10,"Extra milk","Extra Food Shop");
        Client c1=new Client(10,"Extra apples","Extra Food Shop");
        productEFS1.summary(c1);
        Client c2=new Client(15,"Extra apples","Extra Food Shop");
        productEFS1.summary(c2);
        Client c3=new Client(11,"Extra milk","Extra Food Shop");
        productEFS2.summary(c3);
        GlutenFreeShop  productGFS1=new GlutenFreeShop(5,"Special bread","GlutenFreeShop");
        GlutenFreeShop  productGFS2=new GlutenFreeShop(8,"Special milk","GlutenFreeShop");
        Client c4=new Client(4,"Special bread","GlutenFreeShop");
        productGFS1.summary(c4);
        Client c5=new Client(1,"Special bread","GlutenFreeShop");
        productGFS1.summary(c5);
        Client c6=new Client(9,"Special milk","GlutenFreeShop");
        productGFS2.summary(c6);
        HealthyShop productHS1=new HealthyShop(9,"Healthy apples","HealthyShop");
        Client c7=new Client(9,"Healthy apples","HealthyShop");




    }
}

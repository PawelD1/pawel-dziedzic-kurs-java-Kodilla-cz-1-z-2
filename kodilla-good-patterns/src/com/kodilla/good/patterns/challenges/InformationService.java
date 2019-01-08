package com.kodilla.good.patterns.challenges;

public class InformationService
{
    String info(User user, Product product)
    {
        return "The product named "+product.getNameOfProduct()+" is ordered by "+user.getLogin()+".";
    }
}

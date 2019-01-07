package com.kodilla.good.patterns.challenges;

public class SellService
{
    String sell(Product product, User user)
    {
        return "The user"+user.getName()+" "+user.getLastName()+" bought "+product.getNameOfProduct()+" from "+product.getKindOfProduct()+" for price: "+product.getPrice();
    }
    boolean sell(Product nameOfProduct,Product price, User user)
    {
        isSold(nameOfProduct,user);
        if(isSold(nameOfProduct,user))
            return true;
        else return false;
    }
    boolean isSold(Product product, User user)
    {
        if(product!=null&&user!=null)
            return true;
        else
            return false;
    }
}

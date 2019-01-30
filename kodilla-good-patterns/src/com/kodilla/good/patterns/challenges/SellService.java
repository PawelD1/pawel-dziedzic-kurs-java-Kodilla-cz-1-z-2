package com.kodilla.good.patterns.challenges;

public class SellService implements ISellService
{
    public String sell(Product product, User user)
    {
        return "The user "+user.getName()+" "+user.getLastName()+" bought "+product.getNameOfProduct()+" from "+product.getKindOfProduct()+" for price: "+product.getPrice()+"zł.";
    }
    boolean sell(Product nameOfProduct,Product price, User user)
    {
        isSold(nameOfProduct,user);
        if(isSold(nameOfProduct,user))
            return true;
        else return false;
    }
    public boolean isSold(Product product, User user)
    {
        if(product!=null&&user!=null)
            return true;
        else
            return false;
    }
}

package com.kodilla.good.patterns.challenges;

public class SaleDTO
{
    public User user;
    public boolean isSold;

    public SaleDTO(User user,boolean isSold)
    {
        this.user=user;
        this.isSold = isSold;
    }
    public User getUser(){return user;}
    public boolean isSold(){return isSold; }
}

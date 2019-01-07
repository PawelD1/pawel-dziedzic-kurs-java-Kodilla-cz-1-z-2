package com.kodilla.good.patterns.challenges;

public interface ISellService
{
    String sell(Product product, User user);
    boolean isSold(Product product, User user);
}

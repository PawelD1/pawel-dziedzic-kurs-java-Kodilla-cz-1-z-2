package com.kodilla.good.patterns.challenges.food2Door;

public interface Shop
{

    void info(int amount,String kindOfProduct );
    void process(Order order);
    boolean orderIsCompleted(Client client);
    void summary(Client client);
}

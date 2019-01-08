package com.kodilla.good.patterns.challenges.food2Door;

public interface Shop
{
    int amount=0;
    String kindOfProduct="";
    void info(Shop shop,int amount,String kindOfProduct );
    void process();
    boolean orderIsCompleted(Shop shop,Client client);
    void summary(Client client);
}

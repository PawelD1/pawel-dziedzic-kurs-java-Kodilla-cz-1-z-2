package com.kodilla.good.patterns.challenges.food2Door;

public class Client
{
    private int amount;
    private String kindOfProduct;
    private String shop;

    public int getAmount() {
        return amount;
    }

    public String getKindOfProduct() {
        return kindOfProduct;
    }

    public String getShop() {
        return shop;
    }

    public Client(int amount, String kindOfProduct, String shop)
    {
        this.amount = amount;
        this.kindOfProduct=kindOfProduct;
        this.shop=shop;
    }
}

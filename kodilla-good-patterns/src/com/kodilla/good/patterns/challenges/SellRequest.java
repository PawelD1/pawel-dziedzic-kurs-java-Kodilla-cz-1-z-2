package com.kodilla.good.patterns.challenges;

public class SellRequest
{
    private User user;
    private Product nameOfProduct;
    private Product price;

    public SellRequest(final Product nameOfProduct, final Product price, final User user) {
        this.nameOfProduct = nameOfProduct;
        this.price=price;
        this.user=user;
    }
    public User getUser(){return user;}

    public Product getNameOfProduct() {
        return nameOfProduct;
    }

    public Product getPrice() {
        return price;
    }

}

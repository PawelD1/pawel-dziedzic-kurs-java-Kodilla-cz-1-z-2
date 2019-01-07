package com.kodilla.good.patterns.challenges;

public class Product
{
    private String kindOfProduct;
    private String nameOfProduct;
    private int price;

    public String getKindOfProduct() {
        return kindOfProduct;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public int getPrice() {
        return price;
    }

    public Product(String kindOfProduct,String nameOfProduct, int price ) {
        this.kindOfProduct = kindOfProduct;
        this.nameOfProduct=nameOfProduct;
        this.price=price;
    }
}

package com.kodilla.good.patterns.challenges.food2Door;

public class Order {
    private String name;
    private int amount;

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public Order(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }
}

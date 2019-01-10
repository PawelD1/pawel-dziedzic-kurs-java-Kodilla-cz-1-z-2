package com.kodilla.good.patterns.challenges.food2Door;

public class ShopNotExistException extends Exception
{
    public ShopNotExistException(final String message)
    {
        super(message);
    }
}

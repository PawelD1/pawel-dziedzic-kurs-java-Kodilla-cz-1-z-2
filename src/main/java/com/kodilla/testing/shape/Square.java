package com.kodilla.testing.shape;

public class Square implements Shape {

    @Override
    public String getShapeName() {
        return "square";

    }

    @Override
    public double getField() {

        return 25.0;
    }
}

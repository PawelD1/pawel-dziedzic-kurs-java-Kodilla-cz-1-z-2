package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {
    @Test
    public void testAddFigures() {
        //Given
        ShapeCollector sc = new ShapeCollector();
        // ArrayList<Shape> shapes=new ArrayList<Shape>():
        Square square = new Square();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        //When
        sc.addFigure(square);
        sc.addFigure(triangle);
        sc.addFigure(circle);
        //Then
        Assert.assertEquals(3, sc.getListOfFigures().size());
    }

    @Test
    public void testCalculateField() {
        //Given
        Square square = new Square();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        //When
        double result1=square.getField();
        double result2=triangle.getField();
        double result3=circle.getField();
        //Then
        Assert.assertEquals(25.0, result1,0.01);
        Assert.assertEquals(12.5, result2,0.01);
        Assert.assertEquals(75.0, result3,0.01);
    }

    @Test
    public void testShapeName() {
        //Given
        Square square = new Square();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        //When
        String result1=square.getShapeName();
        String result2=triangle.getShapeName();
        String result3=circle.getShapeName();
        //Then
        Assert.assertEquals("square", result1);
        Assert.assertEquals("triangle", result2);
        Assert.assertEquals("circle", result3);
    }

    @Test
    public void testRemoveShape() {
        //Given
        ShapeCollector sc = new ShapeCollector();
        Square square = new Square();
        //When
        sc.addFigure(square);
        int sizeS = sc.getListOfFigures().size();
        sc.removeFigure(square);
        int sizeAfterRemoveS = sc.getListOfFigures().size();
        //Then
        Assert.assertEquals(sizeS - 1, sizeAfterRemoveS);


        //Given
        Triangle triangle = new Triangle();
        //When
        sc.addFigure(triangle);
        int sizeT = sc.getListOfFigures().size();
        sc.removeFigure(triangle);
        int sizeAfterRemoveT = sc.getListOfFigures().size();
        //Then
        Assert.assertEquals(sizeT - 1, sizeAfterRemoveT);


        //Given
        Circle circle = new Circle();
        //When
        sc.addFigure(circle);
        int sizeC = sc.getListOfFigures().size();
        sc.removeFigure(circle);
        int sizeAfterRemoveC = sc.getListOfFigures().size();
        //Then
        Assert.assertEquals(sizeC - 1, sizeAfterRemoveC);
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector sc = new ShapeCollector();
        Square square = new Square();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        //When
        sc.addFigure(square);
        sc.addFigure(triangle);
        sc.addFigure(circle);
        //Then
        Assert.assertEquals(square, sc.getFigure(0));
        Assert.assertEquals(triangle, sc.getFigure(1));
        Assert.assertEquals(circle, sc.getFigure(2));
    }

    @Test
    public void testGetFigureMinus() {
        //Given
        ShapeCollector sc = new ShapeCollector();
        Square square = new Square();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        //When
        sc.addFigure(square);
        sc.addFigure(triangle);
        sc.addFigure(circle);
        //Then
        Assert.assertEquals(null, sc.getFigure(-1));
        // Assert.assertNotEquals(square,sc.getFigure(-1));
        // Assert.assertNotEquals(triangle, sc.getFigure(-1));
        // Assert.assertNotEquals(circle,sc.getFigure(-1));
    }

    @Test
    public void testGetFigureBigIndex() {
        //Given
        ShapeCollector sc = new ShapeCollector();
        Square square = new Square();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        //When
        sc.addFigure(square);
        sc.addFigure(circle);
        sc.addFigure(triangle);
        //Then
        Assert.assertEquals(null, sc.getFigure(20));
        Assert.assertEquals(null, sc.getFigure(4));
        Assert.assertEquals(null, sc.getFigure(15));
    }
}
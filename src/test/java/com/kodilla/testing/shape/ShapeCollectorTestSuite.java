package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {
    @Test
    public void testAddFigures()
    {
        ShapeCollector sc=new ShapeCollector();
       // ArrayList<Shape> shapes=new ArrayList<Shape>():
        Square square=new Square();
        sc.addFigure(square);
        Triangle triangle=new Triangle();
        sc.addFigure(triangle);
        Circle circle=new Circle();
        sc.addFigure(circle);
        Assert.assertEquals(3, sc.getListOfFigures().size());
    }
    @Test
    public void testCalculateField()
    {
        Square square=new Square();
       // square.getField();
        Assert.assertEquals(25.0,square.getField());
        Triangle triangle=new Triangle();
       // triangle.getField();
        Assert.assertEquals(12.5,triangle.getField());
        Circle circle=new Circle();
       // circle.getField();
        Assert.assertEquals(75.0,circle.getField());
    }
    @Test
    public void testShapeName()
    {
        Square square=new Square();
        Assert.assertEquals("square",square.getShapeName());
        Triangle triangle=new Triangle();
        Assert.assertEquals("triangle",triangle.getShapeName());
        Circle circle=new Circle();
        Assert.assertEquals("circle",circle.getShapeName());
    }
    @Test
    public void testRemoveShape()
    {
        ShapeCollector sc=new ShapeCollector();
        Square square=new Square();
        sc.addFigure(square);
        int sizeS=sc.getListOfFigures().size();
        sc.removeFigure(square);
        int sizeAfterRemoveS=sc.getListOfFigures().size();
        Assert.assertEquals(sizeS-1,sizeAfterRemoveS);
        Triangle triangle=new Triangle();
        sc.addFigure(triangle);
        int sizeT=sc.getListOfFigures().size();
        sc.removeFigure(triangle);
        int sizeAfterRemoveT=sc.getListOfFigures().size();
        Assert.assertEquals(sizeT-1,sizeAfterRemoveT);
        Circle circle=new Circle();
        sc.addFigure(circle);
        int sizeC=sc.getListOfFigures().size();
        sc.removeFigure(circle);
        int sizeAfterRemoveC=sc.getListOfFigures().size();
        Assert.assertEquals(sizeC-1,sizeAfterRemoveC);
    }
    @Test
    public void testGetFigure()
    {
        ShapeCollector sc=new ShapeCollector();
        Square square=new Square();
        sc.addFigure(square);
        Triangle triangle=new Triangle();
        sc.addFigure(triangle);
        Circle circle=new Circle();
        sc.addFigure(circle);
        Assert.assertEquals(square,sc.getFigure(0));
        Assert.assertEquals(triangle, sc.getFigure(1));
        Assert.assertEquals(circle,sc.getFigure(2));
    }
    @Test
    public void testGetFigureMinus()
    {
        ShapeCollector sc=new ShapeCollector();
        Square square=new Square();
        sc.addFigure(square);
        Triangle triangle=new Triangle();
        sc.addFigure(triangle);
        Circle circle=new Circle();
        sc.addFigure(circle);
        Assert.assertNotEquals(square,sc.getFigure(-1));
        Assert.assertNotEquals(triangle, sc.getFigure(-1));
        Assert.assertNotEquals(circle,sc.getFigure(-1));
    }
    @Test
    public void testGetFigureBigIndex()
    {
        ShapeCollector sc=new ShapeCollector();
        Square square=new Square();
        sc.addFigure(square);
        Triangle triangle=new Triangle();
        sc.addFigure(triangle);
        Circle circle=new Circle();
        sc.addFigure(circle);
        Assert.assertNotEquals(square,sc.getFigure(20));
        Assert.assertNotEquals(triangle, sc.getFigure(4));
        Assert.assertNotEquals(circle,sc.getFigure(15));
    }
    @Test
    public void testShowFigures()
    {
        ShapeCollector sc=new ShapeCollector();
        Square square=new Square();
        sc.addFigure(square);
        Triangle triangle=new Triangle();
        sc.addFigure(triangle);
        Circle circle=new Circle();
        sc.addFigure(circle);
        Assert.assertEquals("square",sc.getListOfFigures().get(0).getShapeName());
        Assert.assertEquals(25.0,sc.getListOfFigures().get(0).getField());
        Assert.assertEquals("triangle",sc.getListOfFigures().get(1).getShapeName());
        Assert.assertEquals(12.5,sc.getListOfFigures().get(1).getField());
        Assert.assertEquals("circle",sc.getListOfFigures().get(2).getShapeName());
        Assert.assertEquals(75.0,sc.getListOfFigures().get(2).getField());
    }
}

package com.kodilla.testing.shape;
import java.util.ArrayList;

public class ShapeCollector {
    public ArrayList<Shape> getListOfFigures() {
        return listOfFigures;
    }
    private ArrayList <Shape> listOfFigures = new ArrayList <Shape>();
    public void addFigure(Shape shape)
    {
        //ShapeCollector sc=new ShapeCollector();
        //ArrayList < Shape > listOfFigures = new ArrayList < Shape >();//-->już mamy Array List
        listOfFigures.add(shape);
    }
    public void removeFigure(Shape shape)
    {
        //ShapeCollector sc=new ShapeCollector();
        listOfFigures.remove(shape);

    }
    public Shape getFigure(int n)
    {
        if(n>listOfFigures.size()|| n<0)
        {
            return null;
        }
        //ShapeCollector sc=new ShapeCollector();
        return  listOfFigures.get(n);

    }
    public void showFigures()
    {
       // ShapeCollector sc=new ShapeCollector();

        for(int i=0;i<listOfFigures.size();i++)
        {
//            String result="";//->|^| nie da się zrobić return wewnątrz pętli dla wszystkich elementów
//            result+="This is :"+sc.listOfFigures.get(i).getShapeName()+"."+"The field of: "+sc.listOfFigures.get(i).getShapeName()+" is: " +sc.listOfFigures.get(i).getField()+".";
            System.out.println("This is :"+listOfFigures.get(i).getShapeName()+".");
            System.out.println("The field of: "+listOfFigures.get(i).getShapeName()+" is: " +listOfFigures.get(i).getField()+".");
        }

    }
}

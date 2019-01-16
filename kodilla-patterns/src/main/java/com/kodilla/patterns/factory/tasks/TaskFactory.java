package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String DRIVINGTASK="DRIVINGTASK";
    public static final String PAINTINGTASK="PAINTINGTASK";
    public static final String SHOPPINGTASK="SHOPPINGTASK";
    public final Task makeTask(final String taskClass)
    {
        switch(taskClass)
        {
            case DRIVINGTASK:
                return new DrivingTask("driving","Rzeszów","Taxi");
            case PAINTINGTASK:
                return new PaintingTask("painting","red","wall");
            case SHOPPINGTASK:
                return new ShoppingTask("shopping","bread",2);
            default:
                 return null;
        }
    }
}

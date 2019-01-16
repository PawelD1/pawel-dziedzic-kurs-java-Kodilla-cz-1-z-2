package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryDrivingTask()
    {
        //Given
        TaskFactory factory=new TaskFactory();
        //When
        Task drivingTask=factory.makeTask(TaskFactory.DRIVINGTASK);
        //Then
        Assert.assertEquals("driving",drivingTask.getTaskName());
        Assert.assertEquals("Task name driving is done.",drivingTask.executeTask());
        Assert.assertTrue(drivingTask.isTaskExecuted());
    }
    @Test
    public void testFactoryPaintingTask()
    {
        //Given
        TaskFactory factory=new TaskFactory();
        //When
        Task paintingFactory=factory.makeTask(TaskFactory.PAINTINGTASK);
        //Then
        Assert.assertEquals("painting",paintingFactory.getTaskName());
        Assert.assertEquals("Task name painting is done.",paintingFactory.executeTask());
        Assert.assertTrue(paintingFactory.isTaskExecuted());
    }
    @Test
    public void testFactoryShoppingTask()
    {
        //Given
        TaskFactory factory=new TaskFactory();
        //When
        Task shoppingFactory=factory.makeTask(TaskFactory.SHOPPINGTASK);
        //Then
        Assert.assertEquals("shopping",shoppingFactory.getTaskName());
        Assert.assertEquals("Task name shopping is done.",shoppingFactory.executeTask());
        Assert.assertTrue(shoppingFactory.isTaskExecuted());
    }

}

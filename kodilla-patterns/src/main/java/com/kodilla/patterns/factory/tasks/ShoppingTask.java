package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    private String taskName;
    private String whatToBuy;
    private double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }
    @Override
    public String executeTask() {
        return "Task name "+taskName+" is done.";
    }
    @Override
    public String getTaskName()
    {
        return taskName;
    }
    @Override
    public boolean isTaskExecuted()
    {
        return executeTask().equals("Task name "+taskName+" is done.");

    }
}

package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{
    private String taskName;
    private String color;
    private String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
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

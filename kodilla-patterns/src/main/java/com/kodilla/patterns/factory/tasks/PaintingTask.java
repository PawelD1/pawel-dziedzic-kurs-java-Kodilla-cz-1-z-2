package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{
    private String taskName;
    private String color;
    private String whatToPaint;
    boolean isDone=false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }
    @Override
    public String executeTask() {
        isDone=true;
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
        return isDone;
    }
}

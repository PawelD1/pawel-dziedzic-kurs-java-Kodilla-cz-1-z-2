package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    String taskName;
    String where;
    String using;
    boolean isDone=false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String executeTask() {
      this.isDone=true;
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

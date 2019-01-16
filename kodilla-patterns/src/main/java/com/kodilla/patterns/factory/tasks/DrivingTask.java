package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    String taskName;
    String where;
    String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
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

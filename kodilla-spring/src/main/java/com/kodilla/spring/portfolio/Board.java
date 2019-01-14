package com.kodilla.spring.portfolio;

public final class Board
{
    final TaskList toDoList;
    final TaskList inProgressList;
    final TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }
    public void read()
    {
        System.out.println("To do list: "+toDoList.tasks);
        System.out.println("In progress list: "+inProgressList.tasks);
        System.out.println("Done list: "+doneList.tasks);
    }
}

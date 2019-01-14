package com.kodilla.spring.portfolio;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BoardTestSuite
{
    @Test
    public void testTaskAdd()
    {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        List<String> listOfTasksToDo=new ArrayList<>();
        listOfTasksToDo.add("Project");
        board.toDoList.tasks= listOfTasksToDo;

        List<String> listOfTasksInProgress=new ArrayList<>();
        listOfTasksInProgress.add("Game");
        board.inProgressList.tasks=listOfTasksInProgress;

        List<String> listOfTasksDone=new ArrayList<>();
        listOfTasksDone.add("Homework");
        board.doneList.tasks=listOfTasksDone;
        board.read();





    }
}

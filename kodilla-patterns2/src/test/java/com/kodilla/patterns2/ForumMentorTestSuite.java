package com.kodilla.patterns2;

import com.kodilla.patterns2.observer.homework.ForumTask;
import com.kodilla.patterns2.observer.homework.Mentor;
import com.kodilla.patterns2.observer.homework.Student;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ForumMentorTestSuite {
    @Test
    public void testForumTasks() {
        //Given
        Mentor mentor1 = new Mentor("Paweł");
        Mentor mentor2 = new Mentor("Andrzej");
        Student student1 = new Student("Adam", mentor1);
        Student student2 = new Student("Paweł", mentor1);
        Student student3 = new Student("Wojtek", mentor2);
        Student student4 = new Student("Dominik", mentor2);
        Student student5 = new Student("Michał", mentor1);
        ForumTask forumTask = new ForumTask("Kodilla tasks");
        forumTask.registerObserver(mentor1);
        forumTask.registerObserver(mentor2);
        //When
        forumTask.addPost("Task 1", student1);
        forumTask.addPost("Task 1", student2);
        forumTask.addPost("Task 1", student3);
        forumTask.addPost("Task 1", student4);
        forumTask.addPost("Task 1", student5);
        forumTask.addPost("Task 2", student1);
        forumTask.addPost("Task 2", student3);
        forumTask.addPost("Task 3", student1);
        forumTask.addPost("Task 3", student5);
        //Then
        assertEquals(6, mentor1.getUpdateCount());
        assertEquals(3, mentor2.getUpdateCount());


    }

}

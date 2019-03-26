package com.kodilla.patterns2.observer.homework;


public class Mentor implements Observer {
    private final String username;
    private int updateCountOfTasks;


    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(ForumTask forumTask) {
        System.out.println(username + ": New tasks in forum " + forumTask.getName() + ": " + forumTask.getPost() +
                " from " + forumTask.getStudentName() + "\n" + "(total: " + forumTask.getMessages().size() + " messages)");
        updateCountOfTasks++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCountOfTasks;
    }

}

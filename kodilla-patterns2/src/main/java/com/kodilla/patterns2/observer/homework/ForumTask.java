package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class ForumTask implements Observable {
    private List<Observer> observers = new ArrayList<>();
    private List<String> messages;
    private String name;
    private String post;
    private String studentName;


    public ForumTask(String name) {
        messages = new ArrayList<>();
        this.name = name;


    }

    public void addPost(String post, Student student) {
        messages.add(post);
        this.post = post;
        this.studentName = student.getUsername();
        notifyObservers(student);

    }

    @Override
    public void registerObserver(Observer observer) {

        observers.add(observer);
    }

    @Override
    public void notifyObservers(Student student) {
        Mentor mentor = student.getMentor();
        for (Observer observer : observers) {

            if (observer == (Observer) mentor)
                observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<String> getMessages() {
        return messages;
    }

    public String getName() {
        return name;
    }

    public String getPost() {
        return post;
    }

    public String getStudentName() {
        return studentName;
    }
}

package com.kodilla.patterns2.observer.homework;


public class Student {
    private final String username;
    private Mentor mentor;

    public Student(String username, Mentor mentor) {
        this.username = username;
        this.mentor = mentor;
    }

    public String getUsername() {
        return username;
    }

    public Mentor getMentor() {
        return mentor;
    }
}

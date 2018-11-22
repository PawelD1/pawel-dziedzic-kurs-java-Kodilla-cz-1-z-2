package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser
{
    private int id;
    private String name;
    private char sex;
    private LocalDate dateOfBirthday;
    private int amountOfPosts;
    public ForumUser(int id, String name, char sex, LocalDate dateOfBirthday,int amountOfPosts)
    {
        this.id=id;
        this.name=name;
        this.sex=sex;
        this.dateOfBirthday=dateOfBirthday;
        this.amountOfPosts=amountOfPosts;
    }
    public char getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDateOfBirthday() {
        return dateOfBirthday;
    }

    public int getAmountOfPosts() {
        return amountOfPosts;
    }
    @Override
    public String toString() {
        return "User{" +
                "id= '" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", dateOfBirthday='" + dateOfBirthday + '\'' +
                ", amountOfPosts='" + amountOfPosts + '\'' +
                '}';
    }
}

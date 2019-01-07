package com.kodilla.good.patterns.challenges;

public class User
{
 private String login;
 private String name;
 private String lastName;

    public String getLogin()
    {
        return login;
    }

    public String getName()
    {
        return name;
    }

    public String getLastName()
    {
        return lastName;
    }

    public User(String login, String name,String lastName)
    {
        this.login=login;
        this.name=name;
        this.lastName = lastName;
    }
}

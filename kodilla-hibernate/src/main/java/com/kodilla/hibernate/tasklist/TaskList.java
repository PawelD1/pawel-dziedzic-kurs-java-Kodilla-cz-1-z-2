package com.kodilla.hibernate.tasklist;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="TASKLISTS")
public class TaskList {
    private int id;
    private String listName;
    private String description;

    public TaskList(){

    }
    public TaskList(String listName)
    {
        this.listName=listName;
    }
    @Id
    @GeneratedValue
    @NotNull
    @Column(name="ID",unique=true)
    public int getId()
    {
        return id;
    }
    @Column(name="LISTNAME")
    public String getListName()
    {
        return listName;
    }
    @Column(name="DESCRIPTION")
    public String getDescription()
    {
        return description;
    }
}

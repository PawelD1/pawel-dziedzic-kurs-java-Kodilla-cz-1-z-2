package com.kodilla.hibernate.invoice;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {
    private int id;
    private String name;
    private List<Item> items = new ArrayList<>();

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "items",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Item> getItems() {
        return items;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}



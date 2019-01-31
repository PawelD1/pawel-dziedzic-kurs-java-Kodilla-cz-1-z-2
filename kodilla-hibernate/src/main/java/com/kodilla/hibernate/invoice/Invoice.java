package com.kodilla.hibernate.invoice;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Invoice
{
    private  int id;
    private String number;
    private List<Item> items;

    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }
    @OneToMany(
            targetEntity = Product.class,
            mappedBy = "product",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Item> getItems() {
        return items;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}

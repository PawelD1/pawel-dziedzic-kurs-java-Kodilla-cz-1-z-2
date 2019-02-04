package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="INVOICES")
public class Invoice
{
    private  int id;
    private String number;
    private List<Item> items=new ArrayList<>();
    private Product product;
    public Invoice(){

    }

    public Invoice(String number) {
        this.number = number;
    }
    @Id
    @GeneratedValue
    @NotNull
    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }
    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "product",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Item> getItems() {
        return items;
    }

    @OneToOne (cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
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

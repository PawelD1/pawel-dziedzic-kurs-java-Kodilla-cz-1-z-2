package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name="ITEMS")
public class Item
{
    private int id;
    private BigDecimal price;
    private int qunatity;
    private BigDecimal value;
    private Product product;

    public Item(BigDecimal price, int qunatity, BigDecimal value) {
        this.price = price;
        this.qunatity = qunatity;
        this.value = value;
    }
    @Id
    @GeneratedValue
    @NotNull
    public int getId() {
        return id;
    }


    @ManyToOne
    public Product getProduct() {
        return product;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getQunatity() {
        return qunatity;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setQunatity(int qunatity) {
        this.qunatity = qunatity;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}

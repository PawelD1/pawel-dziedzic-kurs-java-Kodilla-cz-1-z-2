package com.kodilla.hibernate.invoice;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.math.BigDecimal;

@Entity
public class Item
{
    private int id;
    private Product product;
    private BigDecimal price;
    private int qunatity;
    private BigDecimal value;

    public int getId() {
        return id;
    }


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

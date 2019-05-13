package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite
{
    @Autowired
    private InvoiceDao invoiceDao;
    @Test
    public void testInvoiceDaoSave()
    {
        //Given
        Item item=new Item(new BigDecimal(200),2,new BigDecimal(300));
        Item item1=new Item(new BigDecimal(100),1,new BigDecimal(200));
        Item item2=new Item(new BigDecimal(300),3,new BigDecimal(400));

        Product product=new Product("Series Game of Thrones");
        product.getItems().add(item);
        product.getItems().add(item1);
        product.getItems().add(item2);

        item.setProduct(product);
        item1.setProduct(product);
        item2.setProduct(product);


        Invoice invoice=new Invoice("One");
        invoice.getItems().add(item1);
        invoice.getItems().add(item);
        invoice.getItems().add(item2);

        item.setInvoice(invoice);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        invoice.setProduct(product);

        //When
        invoiceDao.save(invoice);
        int id=invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        invoiceDao.deleteById(id);
        //błędy: konieczne id, poprawny mapped i bezparametrowy konstruktor w klasie Invoice

    }
}

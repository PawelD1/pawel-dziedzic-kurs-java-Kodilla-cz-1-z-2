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
        Product product=new Product("Series Game of Thrones");
        Product product1=new Product("Games Heroes I-VII Complete");
        Product product2=new Product("Netbook");
        Item item=new Item(new BigDecimal(200),2,new BigDecimal(300));
        Item item1=new Item(new BigDecimal(100),1,new BigDecimal(200));
        Item item2=new Item(new BigDecimal(300),3,new BigDecimal(400));
        List<Item> itemsForProduct=new ArrayList<>();
        itemsForProduct.add(item);
        itemsForProduct.add(item2);
        product.setItems(itemsForProduct);
        List<Item> itemsForProduct1=new ArrayList<>();
        itemsForProduct1.add(item1);
        itemsForProduct.add(item2);
        product1.setItems(itemsForProduct1);
        List<Item> itemsForProduct2=new ArrayList<>();
        itemsForProduct2.add(item);
        itemsForProduct2.add(item1);
        itemsForProduct2.add(item2);
        product.setItems(itemsForProduct2);
        Invoice invoice=new Invoice("One");
        List<Item> itemsForInvoice=new ArrayList<>();
        itemsForInvoice.addAll(itemsForProduct);
        itemsForInvoice.addAll(itemsForProduct1);
        itemsForInvoice.addAll(itemsForProduct2);
        invoice.setItems(itemsForInvoice);


        //When
        invoiceDao.save(invoice);
        int id=invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        invoiceDao.delete(id);
        //błędy: konieczne id, poprawny mapped i bezparametrowy konstruktor w klasie Invoice


    }
}

package com.kodilla.good.patterns.challenges.food2Door;

public class GlutenFreeShop{
    private String name;
    public int amount;
    private String kindOfProduct;



    public String getKindOfProduct() {
        return kindOfProduct;
    }

    public String getName() {
        return name;
    }

    public GlutenFreeShop(int amount, String kindOfProduct, String name) {
        this.amount = amount;
        this.kindOfProduct=kindOfProduct;
        this.name=name;
    }

    void info(Shop shop, int amount, String kindOfProduct )
    {
        System.out.println("The chosen supplier is "+shop+" ,which promise to deliver "+kindOfProduct+" in amount equals: "+amount );
    }
    void process()
    {
        System.out.println("The  "+amount+" pieces of "+kindOfProduct+" is placed in the shop and ready to send");
    }
    boolean orderIsCompleted(Client client)
    {
        return getName().equals(client.getShop())&&getKindOfProduct().equals(client.getKindOfProduct())&&client.getAmount()<=amount&&client.getAmount()>0;
    }
    void summary(Client c)
    {
        if (orderIsCompleted(c))
        {
            process();
            this.amount = this.amount - c.getAmount();
        }
        else
            System.out.println("The product " + getKindOfProduct() + " is not available from " + getName() +
                    " or the wrong amount has been chosen, supplier has got " + amount + " you chosen " + c.getAmount());
    }

}


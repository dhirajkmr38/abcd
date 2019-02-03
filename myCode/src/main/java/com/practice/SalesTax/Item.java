package com.practice.SalesTax;

public class Item
{
    Category itemCategory;
    String itemName;
    double price;
    double itemPriceIncTax;
    boolean isImported;


    public Item( String itemName, double price, double itemPriceIncTax, boolean isImported )
    {
        this.itemName = itemName;
        this.price = price;
        this.itemPriceIncTax = itemPriceIncTax;
        this.isImported = isImported;
    }


    public boolean isImported()
    {
        return isImported;
    }


    public void setImported( boolean imported )
    {
        isImported = imported;
    }


    public double getItemPriceIncTax()
    {
        return itemPriceIncTax;
    }


    public void setItemPriceIncTax( double itemPriceIncTax )
    {
        this.itemPriceIncTax = itemPriceIncTax;
    }




    public Category getItemCategory()
    {
        return itemCategory;
    }


    public void setItemCategory( Category itemCategory )
    {
        this.itemCategory = itemCategory;
    }


    public String getItemName()
    {
        return itemName;
    }


    public void setItemName( String itemName )
    {
        this.itemName = itemName;
    }


    public double getPrice()
    {
        return price;
    }


    public void setPrice( double price )
    {
        this.price = price;
    }


    @Override public String toString()
    {
        return "Item{" + "itemCategory=" + itemCategory + ", itemName='" + itemName + '\'' + ", price=" + price
            + ", itemPriceIncTax=" + itemPriceIncTax + '}';
    }
}

package com.practice.SalesTax;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;


public class ReceiptDetails
{
    List<Item> itemList;
    double totalCostofItem;
    double totalSalesTaxAmount;
   public ReceiptDetails(){
       itemList= new ArrayList<>(  );

   }

    void addItem(Item item){
        itemList.add( item );
        totalCostofItem +=item.getPrice();
        System.out.println(item.itemPriceIncTax+" "+item.price);

        totalSalesTaxAmount= Math.round(   totalSalesTaxAmount+  item.itemPriceIncTax-item.price);

    }


    @Override public String toString()
    {
        return "ReceiptDetails{" + "itemList=" + itemList + ", totalCostofItem=" + totalCostofItem + ", totalSalesTaxAmount="
            + totalSalesTaxAmount + '}';
    }
}

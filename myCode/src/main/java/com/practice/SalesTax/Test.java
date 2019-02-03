package com.practice.SalesTax;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Test
{
    public static void main( String args[] )
    {
        Set<String> bookNameSet = new HashSet<>();
        bookNameSet.add( "book" );
        Set<String> medicineNameSet = new HashSet<>();
        medicineNameSet.add( "headache pills" );
        Set<String> foodNameSet = new HashSet<>();
        foodNameSet.add( "Chocolate bar" );
        Set<String> musicNameSet = new HashSet<>();
        musicNameSet.add( "CD" );

        ItemCategoryMap itemCategoryMap = new ItemCategoryMap();
        itemCategoryMap.addCategoryInMap( Category.MEDICINE, medicineNameSet );
        itemCategoryMap.addCategoryInMap( Category.BOOK, bookNameSet );
        itemCategoryMap.addCategoryInMap( Category.MUSIC, musicNameSet );
        itemCategoryMap.addCategoryInMap( Category.FOOD, foodNameSet );

        Set<Category> applicableCategory = new HashSet<>();
        applicableCategory.add( Category.ALL );
        Set<Category> exceptionalCategory = new HashSet<>();
        exceptionalCategory.add( Category.BOOK );
        exceptionalCategory.add( Category.FOOD );
        exceptionalCategory.add( Category.MEDICINE );

        Rules basicRules = new BasicSalesTaxRule( applicableCategory, exceptionalCategory, 10 );
        Rules importDutyRules = new ImportDutyTaxRule();
        List<Rules> rulesList = new ArrayList();
        rulesList.add( basicRules );
        rulesList.add( importDutyRules );

        List<Item> itemList = new ArrayList<>();
        itemList.add( new Item( "book", 12.49, 12.49, false ) );
        itemList.add( new Item( "CD", 14.99, 14.99, false ) );
        // itemList.add( new Item( "headache pills", 9.75, false ) );
        itemList.add( new Item( "Chocolate bar", 9.75, 9.75, false ) );

        itemList = itemCategoryMap.setItemListCategory( itemList );

        //  System.out.println( itemList );

        ReceiptDetails receiptDetails = new ReceiptDetails();
        for ( Item item : itemList ) {
            for ( Rules rules : rulesList ) {
                double taxAmount = 0;
                if ( rules.isItemMatchesRules( item ) ) {
                    if ( item.getItemPriceIncTax() == 0 )
                        taxAmount = rules.calculateTax( item.getPrice() );
                    else {
                        taxAmount = rules.calculateTax( item.getItemPriceIncTax() );
                    }
                    item.setItemPriceIncTax( item.getPrice() + taxAmount );
                }


            }
            receiptDetails.addItem( item );
        }
        System.out.println( receiptDetails.totalSalesTaxAmount );
    }
}

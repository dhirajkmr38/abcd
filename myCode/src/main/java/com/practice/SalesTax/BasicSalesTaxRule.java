package com.practice.SalesTax;

import java.util.Set;


public class BasicSalesTaxRule implements Rules
{
    private Set<Category> applicableCategoryList; //ALL
    private Set<Category> exceptionalCategoryList;
    private double rate;


    BasicSalesTaxRule( Set<Category> applicableCategoryList, Set<Category> exceptionalCategoryList, double rate )
    {
        this.applicableCategoryList = applicableCategoryList;
        this.exceptionalCategoryList = exceptionalCategoryList;
        this.rate = rate;
    }


    @Override public double calculateTax( double itemOriginalPrice )
    {
        return itemOriginalPrice * (rate)*0.01;
    }


    @Override public boolean isItemMatchesRules( Item item )
    {
        if ( !exceptionalCategoryList.contains( item.itemCategory ) ) {
            if ( applicableCategoryList.contains( Category.ALL ) )
                return true;
            return applicableCategoryList.contains( item.itemCategory );
        }

        return false;
    }

}

package com.practice.SalesTax;

import java.util.List;


public class ImportDutyTaxRule implements Rules
{
    List<Category> applicableCategoryList;
    List<Category> exceptionalCategoryList;
    double rate;

    @Override public double calculateTax( double itemOriginalPrice )
    {
        return itemOriginalPrice * rate;
    }


    @Override public boolean isItemMatchesRules( Item item )
    {
        return item.isImported;
    }

}

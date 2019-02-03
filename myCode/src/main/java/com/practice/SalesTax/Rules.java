package com.practice.SalesTax;

public interface Rules
{


    double calculateTax(double itemOriginalPrice);
    boolean isItemMatchesRules(Item item);
}

package com.practice.SalesTax;

public enum Category
{
   NONE(0), ALL(1),FOOD(1),MEDICINE(2),BOOK(3),MUSIC(4),MISC(5);
    int categoryValue;


    Category( int categoryValue )
    {
        this.categoryValue = categoryValue;
    }


    public int getCategoryValue()
    {
        return categoryValue;
    }

}

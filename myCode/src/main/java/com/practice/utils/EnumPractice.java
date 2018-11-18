package com.practice.utils;

enum Day
{


    SUNDAY( "sunday" ), MONDAY( "monday" );
    String value;


    Day( String value )
    {
        this.value = value;
    }


    public String getValue()
    {
        return value;
    }
}


public class EnumPractice
{
    public static void main( String arg[] )
    {

        Day ontheday = Day.SUNDAY;
        System.out.println( ontheday );
    }
}

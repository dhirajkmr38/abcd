package com.practice.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class testt
{
    public static void main( String ar[] )
    {
        String input = "az cy";
        //  Pattern pattern = Pattern.compile( "([a-d])([m-z])" );
        Pattern pattern = Pattern.compile( "([a-d])([m-z])" );
        Matcher matcher = pattern.matcher( input );
        String output = null;
        System.out.println( matcher.find() );

    }
}
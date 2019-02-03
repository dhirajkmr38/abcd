package com.practice.SalesTax;

import java.util.HashSet;
import java.util.Set;


public class test123
{
    public static void  main(String args[]){

        Set<String > small = new HashSet<>(  );
        small.add( "asc" );
        small.add( "adc" );
        Set<String> large = new HashSet<>(  );
        large.add( "asc" );
        large.add( "adc" );
        if(large.containsAll( small )){
            System.out.println("Ok");
        }



    }
}

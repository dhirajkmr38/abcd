package com.practice.rotttenorange;

public class Test1
{


    public static void main( String args[] )
    {

        double amount = 11.90;
        String am = Double.toString( amount );

        String floatingPoint[] = am.split( "\\." );
        System.out.println( floatingPoint.length );
        for ( String i : floatingPoint ) {
            System.out.println( i );
        }

    }
}

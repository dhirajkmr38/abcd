package com.practice;

public class DP2
{
    static int max( int a, int b )
    {
        if ( a > b )
            return a;
        else
            return b;
    }


    static int recur( String inp1, String inp2, int n, int m )
    {
        if ( n ==0 || m== 0 ) {
            return 0;
        } else if ( inp1.substring( 0,n ).equals( inp2.substring( 0,m ) )) {
            return inp1.substring(0, n ).length();
        } else {
            System.out.println(inp1.substring( 0,n )+" "+inp2.substring(0, m ));
            return max( recur( inp1, inp2, n - 1, m ), recur( inp1, inp2, n, m - 1 ) );
        }
    }


    public static void main( String args[] )
    {
        String inp1 = "cab";
        String inp2 = "abc";

       // System.out.println(inp1.substring(0,0));

       System.out.println( recur( inp1, inp2, inp1.length(),inp2.length() ) );
    }
}

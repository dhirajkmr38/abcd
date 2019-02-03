package com.practice.utils;

public class SubStringDP
{
    static int max( int a, int b )
    {
        if ( a > b )
            return a;
        else
            return b;
    }


    static int recur( String inp, int i, int j, String inp2 ) throws ArrayIndexOutOfBoundsException
    {

        if ( i >= inp.length() || j <= 0 || i >= j ) {
            return 0;
        } else if ( inp2.contains( inp.substring( i, j ) ) ) {
            return inp.substring( i, j ).length();
        } else {
          //     System.out.println( inp.substring( i, j ) );
            return max( recur( inp, i + 1, j, inp2 ), recur( inp, i, j - 1, inp2 ) );

        }
    }


    public static void main( String args[] )
    {
        String inp = "WYQDNTDMFRTZLQSEKEJHZKSKLFEPXCHVCZYSVDGCXBBISWMEAYLZIFKTMOIKSSFXTGPOJXQIYSRSQFWQDJQNQCGDQRNLLUI";
        String inp2 = "EAZVMWNUUFNNXVLOYVGMLIUQANDLYAVFAUAOSNLNVACSVPIUMOIAWCQXSWKQWGXYAZNTNAIKAMEYBNUQBCQAGGXACHRYNQXQQM";

        System.out.println( recur( inp, 0, inp.length(), inp2 ) );

    }
}




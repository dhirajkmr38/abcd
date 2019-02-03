package com.practice.pojo;

public class Test123
{
    static String convertToString( int input[] )
    {
        StringBuffer sb = new StringBuffer();
        for ( int i = 0; i < input.length; i++ ) {
            if ( input[i] == -1 )
                continue;
            char c = (char)(input[i]+97);
            sb.append( c );

        }

        return sb.toString();
    }


    public static void main( String arg[] )
    {
        int number[] = { 0, 1, 2, 3 };
        String a = convertToString( number );
        String b = convertToString( number );
        System.out.println( a );
        System.out.println( b.length() );

    }
}
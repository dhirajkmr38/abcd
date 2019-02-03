package com.practice.utils;

public class EditDistance
{
    static int dp[][] = new int[100][100];


    public static void main( String args[] )
    {
        String inp1 = "lrbbmqbhcdarzowkkyhiddqscdxrjmowfrxsjybldbefsarcbynecdyggxxpklorellnmpapqfwkhopkmcoq";
        String inp2 = "hnwnkuewhsqmgbbuqcljjivswmdkqtbxixmvtrrbljptnsnfwzqfjmafadrrwsofsbcnuvqhffbsaqxwpqcaceh";
        System.out.println( recur( inp1, inp2, 0, 0 ) );
    }


    static int min( int a, int b, int c )
    {
        if ( a < b && a < c ) {
            return a;
        } else {
            if ( b > c )
                return c;
            else
                return b;
        }
    }


    static int recur( String inp1, String inp2, int index1, int index2 )
    {
        if ( index1 >= inp1.length() && index2 >= inp2.length()  ) {
            return 0;
        } else if ( index1 >= inp1.length() || index2 >= inp2.length() ) {
            if ( inp1.length() > inp2.length() ) {
                return inp1.length() - inp2.length();
            } else {
                return inp2.length() - inp1.length();
            }

        } else if ( dp[index1][index2] != 0 ) {
              System.out.println("From Map");
            return dp[index1][index2];
        } else if ( inp1.charAt( index1 ) == inp2.charAt( index2 ) ) {
            return recur( inp1, inp2, index1 + 1, index2 + 1 );
        } else {

            int currentCount = min( 1 + recur( inp1, inp2, index1 + 1, index2 + 1 ),
                1 + recur( inp1, inp2, index1 + 1, index2 ), 1 + recur( inp1, inp2, index1, index2 + 1 ) );
               dp[index1][index2]=currentCount;
            return currentCount;

        }
    }


    static String add( String inp1, String inp2 )
    {
        StringBuffer output;
        if ( inp1.length() > inp2.length() ) {
            output = new StringBuffer( inp2 );
            output.insert( 0, inp1.charAt( 0 ) );
        } else {
            output = new StringBuffer( inp1 );
            output.insert( 0, inp2.charAt( 0 ) );
        }
        return output.toString();
    }


    String delete( String inp1, String inp2 )
    {
        if ( inp1.length() > inp2.length() ) {
            return inp1.substring( 1 );
        } else {
            return inp2.substring( 1 );
        }
    }

}
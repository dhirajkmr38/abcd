package com.practice.utils;

import java.util.Scanner;


public class LongestSubq
{
    static int dp[][] = new int[100][100];


    static int min( int a, int b )
    {
        if ( a > b )
            return a;
        else
            return b;
    }


    static int recur( String inp1, String inp2, int index1, int index2 )
    {

        if ( index1 < 0 || index2 < 0 ) {
            return 0;
        }
        if ( dp[index1][index2] != 0 ) {
            //      System.out.println("From ");
            return dp[index1][index2];
        } else if ( inp1.charAt( index1 ) == inp2.charAt( index2 ) ) {
            return 1 + recur( inp1, inp2, index1 - 1, index2 - 1 );
        } else {
            int number = min( recur( inp1, inp2, index1 - 1, index2 ), recur( inp1, inp2, index1, index2 - 1 ) );
            dp[index1][index2] = number;
            return number;
        }

    }


    public static void main( String args[] )
    {
        Scanner sc = new Scanner( System.in );
        //      int test = sc.nextInt();
        //      while(test!=0){
        //
        //      --test;
        //      int lenght1=sc.nextInt();
        //      int lenght2=sc.nextInt();
        //        String inp1 = sc.next();
        //        String inp2 = sc.next();
        String inp1 = "abcd";
        String inp2 = "bcd";
        System.out.println( recur( inp1, inp2, inp1.length() - 1, inp2.length() - 1 ) );
    }
}

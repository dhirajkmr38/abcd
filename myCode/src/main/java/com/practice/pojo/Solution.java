package com.practice.pojo;

import java.util.Scanner;


public class Solution
{
    private static String areCandiesAvailable( int noOfBox, int[] chocolatePerBox, int noOfChildren )
    {
        boolean boxChildrenArr[][] = new boolean[noOfChildren + 1][noOfBox + 1];

        for ( int i = 0; i <= noOfBox; i++ )
            boxChildrenArr[0][i] = true;
        for ( int i = 1; i <= noOfChildren; i++ )
            boxChildrenArr[i][0] = false;

        for ( int i = 1; i <= noOfChildren; i++ ) {
            for ( int j = 1; j <= noOfBox; j++ ) {
                boxChildrenArr[i][j] = boxChildrenArr[i][j - 1];
                if ( i >= chocolatePerBox[j - 1] )
                    boxChildrenArr[i][j] = boxChildrenArr[i][j] || boxChildrenArr[i - chocolatePerBox[j - 1]][j - 1];
            }
        }

        return boxChildrenArr[noOfChildren][noOfBox] ? "YES" : "NO";
    }


    public static void main( String args[] )
    {
        Scanner sc = new Scanner( System.in );
        int test = sc.nextInt();

        for ( int j = 0; j < test; j-- ) {
            int chocolatesInBox[] = new int[1000];

            int numberOfBox = sc.nextInt();
            for ( int i = 0; i < numberOfBox; i++ ) {
                chocolatesInBox[i] = sc.nextInt();
            }
            int sum = sc.nextInt();

            System.out.println( areCandiesAvailable( numberOfBox, chocolatesInBox, sum ) );
        }
    }
}


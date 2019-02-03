package com.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class DynamicProgramming
{  static boolean found1;
    static void recur( int inp[], int currentIndex, Set<Integer> currentSet, int sum, int requiredSum ,Boolean found,int size)
    {
        if(sum==requiredSum){
            System.out.println("Yes");
            found1 =true;
            return;
        }
        if ( currentIndex == size || found1== true) {
            return;
        } else {


            recur( inp, currentIndex + 1, currentSet, sum, requiredSum ,false,size);
            currentSet.add( inp[currentIndex] );
          //  sum = sum + inp[currentIndex];
            if(found1==true)
                return;
            recur( inp, currentIndex + 1, currentSet, sum+inp[currentIndex], requiredSum,false,size );
           // System.out.println(currentSet);
            currentSet.remove( inp[currentIndex] );
        }
    }


    public static void main( String args[] )
    {
        int test;
        Scanner sc = new Scanner( System.in );
        test = sc.nextInt();
        for ( int t0 = 0; t0 < test; t0++ ) {
            int n = sc.nextInt();
            int inp[] = new int[1000];
            for ( int i = 0; i < n; i++ ) {
                inp[i] = sc.nextInt();
            }
            Set<Integer> set = new HashSet<>();
            recur( inp, 0, set, 0, 1, false, n );


        }
    }
}

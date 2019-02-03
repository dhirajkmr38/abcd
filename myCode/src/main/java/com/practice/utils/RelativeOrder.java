package com.practice.utils;

import java.util.*;


public class RelativeOrder
{


    public static void main( String args[] )
    {
        Scanner sc = new Scanner( System.in );
        int test = sc.nextInt();
        while ( test != 0 ) {

            --test;
            //int inp[]= {4,2, 1, 2, 5, 7, 1, 9, 3, 6,1, 8, 8,9,9,1};
            //int pattern[]={2, 1, 8, 3};
          //  int inp[] = new int[1000];
           ArrayList<Integer> inp = new ArrayList<>(  );
            int pattern[] = new int[1000];
            int n1 = sc.nextInt();
            int m1 = sc.nextInt();
            for ( int i = 0; i < n1; i++ ) {
                inp.add(   sc.nextInt());
            }
            for(int i=0;i<m1;i++){
                pattern[i]=sc.nextInt();
            }
            Map<Integer, Integer> map = new HashMap<>();
            for ( int i = 0; i < n1; i++ ) {
                if ( map.containsKey( inp.get( i ) ) ) {
                    map.put( inp.get( i ), map.get( inp.get( i ) ) + 1 );
                } else {
                    map.put( inp.get( i ), 1 );
                }
            }
            ArrayList<Integer> result = new ArrayList<>();

            for ( int i = 0; i < m1; i++ ) {
                int counter=0;
                try {
                    counter = map.get( pattern[i] );
                }
                catch ( Exception e){}
                while ( counter != 0 ) {
                    result.add( pattern[i] );
                    --counter;

                }
            }

            Set<Integer> patternSet = new HashSet<>();
            for ( int i = 0; i < m1; i++ ) {
                patternSet.add( pattern[i] );
            }
           Collections.sort( inp );
            for ( int i = 0; i < n1; i++ ) {
                if ( patternSet.contains( inp.get( i ) ) ) {
                    continue;
                } else {
                    result.add( inp.get( i ) );
                }
            }
            for(int x:result){
                System.out.print(x+" ");
            }
           // System.out.println( result.size() );
        }
    }

}

package com.practice.utils;

public class ChainProblem
{


    public static void main( String arg[] )
    {



        int arr[] = { 4, 3, 1, 2, 0, 0 };

        for ( int i = 0; i < arr.length; i++ ) {
            int startIndex = i;
            int currentIndex = arr[arr[startIndex]];
            int counter = 0;
            System.out.print(currentIndex+" ");
            int loop=0;
            while ( currentIndex != startIndex && currentIndex != arr[arr[currentIndex]] ) {

                if( currentIndex != arr[arr[currentIndex]]){
                    loop=1;
                }
                ++counter;
                currentIndex = arr[arr[currentIndex]];
            }
            System.out.println();
            if(loop==0){
                System.out.println("HE");
            }
        }
    }
}

package com.practice;

import java.util.*;


public class BinaryDp
{
    public static String append( String input, char c, int index )
    {

        //  ArrayList<Character> characters = new ArrayList<>();
        StringBuffer buffer = new StringBuffer();
        for ( int i = 0; i < input.length(); i++ ) {
            if ( i == index ) {
                if (( input.charAt( i ) == '1' && c == '1' )|| (i>0 &&input.charAt( i-1 ) == '1' )) {
                    return "";
                } else {
                    buffer.append( c );
                }
            }
            buffer.append( input.charAt( i ) );
        }

        return buffer.toString();
    }


    public static Set process( Set<String> set )
    {
        System.out.println("PRocessing");
        Set<String> newArrayList = new HashSet<>();
        for ( String inp : set ) {
           newArrayList.add( "0"+inp );
        }
        for ( String inp : set ) {
           if(inp.charAt( 0 )=='0')
            newArrayList.add( "1"+inp );
        }


        return newArrayList;
    }


    public static void main( String arg[] )
    {
        ArrayList<Set<String>> setArrayList = new ArrayList<>();
        Set<String> firstArrayList = new HashSet<>();
        firstArrayList.add( new String( "0" ) );
        firstArrayList.add( new String( "1" ) );
        setArrayList.add( firstArrayList );
        for ( int i = 1; i < 20; i++ ) {
            Set<String> set = new HashSet<>( setArrayList.get( i - 1 ) );
            setArrayList.add( process( set ) );
        }
        System.out.println("Done processing ");
        System.out.println(setArrayList);
      //  System.out.println(setArrayList.get( 99 ));
//        Scanner sc = new Scanner( System.in );
//        int test = sc.nextInt();
//        for(int to=0;to<test;to++){
//            int number = sc.nextInt();
//            System.out.println(setArrayList.get( number -1).size());
//        }

    }
}

package com.practice.pojo;

import com.practice.utils.Tree1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;


public class VerticalOrder
{
    static int min;
    static int max;

    static Map map;


    static void recur( Node node, int disp )
    {
        if ( node == null )
            return;

        else {
            ArrayList<Integer> currentArrayList = (ArrayList<Integer>) map.get( disp );
            if ( currentArrayList == null ) {
                currentArrayList = new ArrayList<Integer>();
            }
            if ( min > disp ) {
                min = disp;
            }
            if ( max < disp ) {
                max = disp;
            }
            currentArrayList.add( node.data );
            map.put( disp, currentArrayList );
            recur( node.left, disp - 1 );
            recur( node.right, disp + 1 );
        }
    }


    static void verticalOrder( Node root )
    {
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;

        map = new HashMap<Integer, ArrayList<Integer>>();
        recur( root, 0 );
        for ( int i = min; i <= max; i++ ) {
            ArrayList<Integer> ArrayList = (ArrayList<Integer>) map.get( i );
            for ( int a : ArrayList ) {
                System.out.print( a + " " );
            }
        }
    }


    public static void main( String args[] )
    {

        Node root = new Tree1().getRoot();
        verticalOrder( root );

    }


}

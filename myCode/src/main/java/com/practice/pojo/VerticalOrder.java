package com.practice.pojo;

import com.practice.utils.Tree1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
            List<Integer> currentList = (List<Integer>) map.get( disp );
            if ( currentList == null ) {
                currentList = new ArrayList<Integer>();
            }
            if ( min > disp ) {
                min = disp;
            }
            if ( max < disp ) {
                max = disp;
            }
            currentList.add( node.data );
            map.put( disp, currentList );
            recur( node.left, disp - 1 );
            recur( node.right, disp + 1 );
        }
    }


    static void verticalOrder( Node root )
    {
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;

        map = new HashMap<Integer, List<Integer>>();
        recur( root, 0 );
        for ( int i = min; i <= max; i++ ) {
            List<Integer> list = (List<Integer>) map.get( i );
            for ( int a : list ) {
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

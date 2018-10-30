package com.practice.utils;

import com.practice.pojo.Node;

import java.util.HashMap;
import java.util.Map;


public class TopViewTree
{

    static Map<Integer, Node> map = new HashMap<Integer, Node>();


    public static void main( String args[] )
    {
        Node root = new Tree1().getRoot();
        printTopView( root );
    }


    public static void printTopView( Node root )
    {
        if ( root == null ) {
            return;
        } else {
            printLeft( root.left, -1 );
            System.out.println( root.data );
            printRight( root.right, 1 );
            map = new HashMap<Integer, Node>();
        }
    }


    public static void printRight( Node root, int width )
    {
        if ( root == null ) {
            return;
        } else {
            if ( width > 0 && map.containsKey( width ) == false ) {
                System.out.println( root );
                map.put( width, root );

            }
            printRight( root.right, width + 1 );
            printRight( root.left, width - 1 );
        }

    }


    public static void printLeft( Node root, int width )
    {
        if ( root == null ) {
            return;
        } else {
            if ( width < 0 && map.containsKey( width ) == false ) {
                System.out.println( root );
                map.put( width, root );

            }
            printLeft( root.left, width - 1 );
            printLeft( root.right, width + 1 );
        }

    }
}

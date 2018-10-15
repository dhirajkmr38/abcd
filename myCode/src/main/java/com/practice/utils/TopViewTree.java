package com.practice.utils;

import com.practice.pojo.Node;

import java.util.HashMap;
import java.util.Map;


public class TopViewTree
{

    Map<Integer, Node> map = new HashMap<Integer, Node>();


    public static void main( String args[] )
    {
        Node root = new Tree1().getRoot();

        new TopViewTree().printTopView( root );

    }


    public void printTopView( Node root )
    {
        if ( root == null ) {
            return;
        } else {

            print( root, 0 );
            map = new HashMap<Integer, Node>();
        }


    }


    public void print( Node root, int width )
    {
        if ( root == null ) {
            return;
        } else {
            if ( map.containsKey( width ) == false ) {
                System.out.println( root );
                map.put( width, root );

            }
            print( root.left, width - 1 );
            print( root.right, width + 1 );
        }

    }
}

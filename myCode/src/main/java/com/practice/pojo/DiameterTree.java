package com.practice.pojo;

import com.practice.utils.Tree1;


public class DiameterTree
{
    int max;


    static int max( int a, int b )
    {
        if ( a > b )
            return a;
        else
            return b;
    }


    public static void main( String arg[] )
    {
        Node root = new Tree1().getRoot();
        DiameterTree dt = new DiameterTree();
        dt.recur( root );
        System.out.println( dt.max );
    }


    int recur( Node node )
    {
        if ( node == null ) {
            return 0;
        } else if ( node.left == null && node.right == null ) {
            return 1;
        } else {
            int leftMax = recur( node.left );
            int rightMax = recur( node.right );
            if ( ( leftMax + rightMax ) > max ) {
                max = leftMax + rightMax;
            }
            return max( rightMax, leftMax ) + 1;

        }
    }
}

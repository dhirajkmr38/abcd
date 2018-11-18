package com.practice.pojo;

import com.practice.utils.Tree1;


public class CheckBST
{
    static int compareMin( int a, int b )
    {
        if ( a > b )
            return b;
        else
            return a;
    }


    static int compareMax( int a, int b )
    {
        if ( a > b )
            return a;
        else
            return b;

    }


    static int getMax( Node node )
    {
        if ( node == null )
            return Integer.MIN_VALUE;
        else if ( node.left == null && node.right == null ) {
            return node.data;
        } else {
            int leftMax = getMax( node.left );
            int rightMax = getMax( node.right );

            return compareMax( leftMax, rightMax );

        }


    }


    static int getMin( Node node )
    {
        if ( node == null )
            return Integer.MAX_VALUE;
        else if ( node.left == null && node.right == null ) {
            return node.data;
        } else {
            int leftMin = getMin( node.left );
            int rightMin = getMin( node.right );
            return compareMin( leftMin, rightMin );
        }
    }


    static boolean checkAtRoot( Node node )
    {
        int leftMax = getMax( node.left );
        int rightMin = getMin( node.right );
        return node.data > leftMax && node.data < rightMin;
    }


    static boolean checkBst( Node node )
    {
        if ( node == null )
            return true;

        else if ( node.left == null && node.right == null ) {
            return true;
        } else {

            if ( checkBst( node.left ) && checkBst( ( node.right ) ) ) {
                if ( checkAtRoot( node ) ) {

                } else {
                    return false;
                }
            }

        }
        return false;
    }


    public static void main( String args[] )
    {
        Node root = new Tree1().getRoot1();
        System.out.println( checkBst( root ) );

    }

}
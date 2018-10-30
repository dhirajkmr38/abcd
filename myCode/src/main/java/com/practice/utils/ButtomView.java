package com.practice.utils;

import com.practice.pojo.TreeNode;

import java.util.HashSet;
import java.util.Set;


public class ButtomView
{
    public static void main( String arg[] )
    {
        TreeNode root = new Tree().getRoot();
        Set<Integer> marker = new HashSet<Integer>();
        new ButtomView().printButtom( root, marker, 0 );
    }


    boolean isLeaf( TreeNode root )
    {
        return root.left == null && root.right == null;
    }


    void printButtom( TreeNode root, Set<Integer> set, int width )
    {
        if ( root == null )
            return;
        else {
            printButtom( root.left, set, width - 1 );
            if ( set.contains( width ) == false || isLeaf( root ) == true ) {
                System.out.print( root.key + " " );
                set.add( width );
            }
            printButtom( root.right, set, width + 1 );

        }
    }
}

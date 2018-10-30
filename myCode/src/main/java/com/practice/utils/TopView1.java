package com.practice.utils;

import com.practice.pojo.TreeNode;
import com.practice.pojo.WrapperTreeNode;

import java.util.LinkedList;
import java.util.Queue;


public class TopView1
{


    public static void main( String arg[] )
    {
        TreeNode root = new Tree().getRoot();

        new TopView1().printTopView( root );

    }


    public WrapperTreeNode getWidth( TreeNode root, int width )
    {
        if ( root == null ) {
            return null;
        } else {
            WrapperTreeNode wrapperTreeNode = new WrapperTreeNode();
            wrapperTreeNode.treeNode = root;
            wrapperTreeNode.width = width;
            wrapperTreeNode.left = getWidth( root.left, width - 1 );
            wrapperTreeNode.right = getWidth( root.right, width + 1 );
            return wrapperTreeNode;
        }
    }


    public void levelOrder( WrapperTreeNode root )
    {
        int curmin = 0;
        int curmax = 0;
        Queue<WrapperTreeNode> queue = new LinkedList<WrapperTreeNode>();
        queue.add( root );
        System.out.print( root.treeNode.key + " " );
        while ( queue.size() != 0 ) {
            WrapperTreeNode cur = queue.remove();
            if ( cur.left != null ) {
                queue.add( cur.left );
            }
            if ( cur.right != null ) {
                queue.add( cur.right );
            }
            if ( cur.width < curmin ) {
                System.out.print( cur.treeNode.key + " " );
                curmin = cur.width;

            } else if ( cur.width > curmax ) {
                System.out.print( cur.treeNode.key + " " );
                curmax = cur.width;
            }
        }
    }


    void printTree( WrapperTreeNode root )
    {
        if ( root == null ) {
            return;
        } else {
            printTree( root.left );
            System.out.println( "Z" + root );
            printTree( root.right );
        }
    }


    void printTree( TreeNode root )
    {
        if ( root == null ) {
            return;
        } else {
            printTree( root.left );
            System.out.println( root );
            printTree( root.right );
        }
    }


    public void printTopView( TreeNode root )
    {
        if ( root == null )
            return;
        else {
            Queue<WrapperTreeNode> queue = new LinkedList<WrapperTreeNode>();
            WrapperTreeNode root1 = getWidth( root, 0 );
            printTree( root );

            levelOrder( root1 );
        }

    }
}

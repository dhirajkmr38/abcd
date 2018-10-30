package com.practice.utils;

import com.practice.pojo.TreeNode;


public class Tree
{
    TreeNode root;


    public TreeNode getRoot()
    {
        //        root = new TreeNode( 20 );
        //        root.left = new TreeNode( 10 );
        //        root.left.left = new TreeNode( 5 );
        //        root.left.left.left = new TreeNode( 1 );
        //        root.left.left.left.right = new TreeNode( 50 );
        //        root.left.left.left.right.right = new TreeNode( 30 );
        //       root = new TreeNode( 1 );
        //       root.left= new TreeNode( 2 );
        //       root.right= new TreeNode( 3 );
        root = new TreeNode( 1 );
        root.left = new TreeNode( 2 );
        root.right = new TreeNode( 3 );
        root.right.left = new TreeNode( 5 );
        root.right.left.left = new TreeNode( 7 );
        root.right.left.right = new TreeNode( 8 );
        return root;

    }

}

package com.practice.utils;

import com.practice.pojo.TreeNode;


public class Tree
{
    TreeNode root;


    public TreeNode getRoot()
    {
        root = new TreeNode( 1 );
        root.left = new TreeNode( 2 );
        root.right = new TreeNode( 3 );
        root.left.left = new TreeNode( 4 );
        root.left.left.left = new TreeNode( 5 );
        root.right.right = new TreeNode( 6 );
        root.right.left = new TreeNode( 7 );

        return root;
    }

}

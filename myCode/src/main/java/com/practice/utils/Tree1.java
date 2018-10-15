package com.practice.utils;

import com.practice.pojo.Node;


public class Tree1
{

    Node root;


    Node getRoot()
    {
        root = new Node( 1 );
        root.right = new Node( 2 );
        root.right.right = new Node( 5 );
        root.right.right.left = new Node( 3 );
        root.right.right.left.right = new Node( 4 );
        return root;

    }

}

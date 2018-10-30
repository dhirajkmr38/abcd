package com.practice.utils;

import com.practice.pojo.Node;


public class Tree1
{

    Node root;


    public Node getRoot()
    {
        //        root = new Node( 20 );
        //        root.right = new Node( 19 );
        //        root.left = new Node( 10 );
        //        root.left.left = new Node( 15 );
        //        root.left.left.left = new Node( 10 );
        //        root.left.left.left.right = new Node( 50 );
        //        root.left.left.left.right.right = new Node( 30 );
        root = new Node( 21 );
        root.left = new Node( 57 );
        root.right = new Node( 12 );

        return root;

    }

}

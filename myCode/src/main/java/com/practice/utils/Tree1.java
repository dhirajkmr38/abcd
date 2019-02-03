package com.practice.utils;

import com.practice.pojo.Node;


public class Tree1
{

    Node root;


    public Node getRoot()
    {
        //        root = new Node( 20 );
        //        root.right = new Node( 19 );
        //        root.right.right = new Node( 29 );
        //        root.left = new Node( 10 );
        //        root.left.left = new Node( 15 );
        //        root.left.left.left = new Node( 10 );
        //        root.left.left.left.right = new Node( 50 );
        //        root.left.left.left.right.left = new Node( 20 );
        //        root.left.left.left.right.right = new Node( 30 );
        //  root = new Node( 21 );
        //        root.left = new Node( 57 );
        //        root.right = new Node( 12 );
        //        root= new Node(1);
        //        root.right= new Node(2);
        //        root.right.right= new Node(3);
        //        root.right.right.right= new Node(4);
        //        root.right.right.right.right= new Node(5);
        //        root.right.right.right.right.right= new Node(6);
        root = new Node( 10 );
        root.left = new Node( 5 );
        root.right = new Node( 70 );
        root.left.left = new Node( 12 );
        root.left.right = new Node( 18 );


        return root;

    }


    public Node getRoot1()
    {
        //        root = new Node( 20 );
        //        root.left = new Node( 10 );
        //        root.right = new Node( 19 );
        //        root.right.right = new Node( 29 );
        root = new Node( 10 );
        root.left = new Node( 7 );
        // root.left.left= new Node(17);
        root.right = new Node( 11 );
        root.right.right = new Node( 12 );
        root.right.right.right = new Node( 14 );
        root.right.right.right.right = new Node( 17 );
        return root;
    }

}

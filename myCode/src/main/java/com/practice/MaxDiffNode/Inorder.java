package com.practice.MaxDiffNode;

import com.practice.pojo.Node;
import com.practice.utils.Tree1;

import java.util.LinkedList;
import java.util.Queue;


public class Inorder
{

    public static void print( Queue<Node> queue )
    {
        if ( queue.size() < 2 ) {
            return;
        }
        Node first = queue.poll();
        Node rep = queue.poll();
        System.out.print( first.data + "->" + rep.data + " " );
        while ( queue.isEmpty() == false ) {

            Node next = queue.poll();
            System.out.print( rep.data + "->" + next.data + " " );
            rep = next;
        }
        System.out.print( rep.data + "->-1" );

    }


    public static void recur( Node root, Queue<Node> queue )
    {
        if ( root == null ) {
            return;
        }
        recur( root.left, queue );
        queue.add( root );
        recur( root.right, queue );


    }


    public static void populateNext( Node root )
    {
        Queue<Node> queue = new LinkedList<Node>();
        recur( root, queue );
        print( queue );
    }


    public static void main( String args[] )
    {
        Node root = new Tree1().getRoot();
        populateNext( root );

    }
}

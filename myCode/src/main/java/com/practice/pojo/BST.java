package com.practice.pojo;

import com.practice.utils.Tree1;

import java.util.LinkedList;
import java.util.Queue;


public class BST
{

    static void getQueue( Node root, Queue<Integer> queue )
    {
        if ( root == null )
            return;
        else {
            getQueue( root.left, queue );
            queue.add( root.data );
            getQueue( root.right, queue );
        }
        return;
    }


    static void oneQueueEmpty( Queue<Integer> q1, Queue<Integer> q2 )
    {
        if ( q1.isEmpty() || q2.isEmpty() ) {
            while ( q1.isEmpty() == false ) {
                System.out.println( q1.remove() );
            }
            while ( q2.isEmpty() == false ) {
                System.out.println( q2.remove() );
            }
        }
    }


    static void merge( Queue<Integer> q1, Queue<Integer> q2 )
    {
        if ( q1.isEmpty() == false || q2.isEmpty() == false ) {
            oneQueueEmpty( q1, q2 );
        }


        while ( q1.isEmpty() == false && q2.isEmpty() == false ) {
            if ( q1.peek() < q2.peek() ) {
                System.out.println( q1.remove() );
            } else {
                System.out.println( q2.remove() );
            }
        }
        oneQueueEmpty( q1, q2 );
    }


    public static void main( String arg[] )
    {
        Node root1 = new Tree1().getRoot();
        Node root2 = new Tree1().getRoot1();
        Queue<Integer> firstQueue = new LinkedList<Integer>();
        getQueue( root1, firstQueue );
        Queue<Integer> secondQueue = new LinkedList<Integer>();
        getQueue( root2, secondQueue );
        System.out.println( firstQueue );
        System.out.println( secondQueue );
        merge( firstQueue, secondQueue );

    }

}

package com.practice.LinkedList;

import java.util.LinkedList;
import java.util.List;


public class SwapGroup
{

    static void print( Node header )
    {
        while ( header != null ) {
            System.out.print( header.data + " " );
            header = header.next;
        }
        System.out.println();
    }


    static List<Node> breakListIntoKSizeList( Node header, int k )
    {
        List<Node> queue = new LinkedList<>();
        Node cur = header;
        int counter = 1;
        Node currentHead = header;
        Node tail = currentHead;
        while ( tail != null ) {
            if ( counter == k ) {
                queue.add( currentHead );
                currentHead = tail.next;
                tail.next = null;
                tail = currentHead;
                counter = 1;
            } else {
                ++counter;
                tail = tail.next;
            }
        }
        if ( currentHead != null ) {
            queue.add( currentHead );
        }
        return queue;

    }


    static void reverseEachSplittedList( List<Node> queue )
    {

        for ( int i = 0; i < queue.size(); i++ ) {

            queue.set( i, reverseList( queue.get( i ) ) );

        }
    }


    static Node reverseList( Node header )
    {
        if ( header.next == null )
            return header;
        Node newHead = header;
        while ( true ) {
            Node nextptr = header.next;
            header.next = header.next.next;
            nextptr.next = newHead;
            newHead = nextptr;
            if ( header.next == null ) {
                return newHead;
            }


        }

    }


    static void joinReversedLinks( List<Node> reversedLinks )
    {

        for ( int i = 0; i < reversedLinks.size()-1; i++ ) {
            Node firstLinkHead = reversedLinks.get( i );
            Node tail = firstLinkHead;
            while ( tail.next!=null ){
                tail=tail.next;
            }
            tail.next=reversedLinks.get( i+1 );
        }

    }


    public static void main( String args[] )
    {
        Node header = new Node( 1 );
        header.next = new Node( 2 );
        header.next.next = new Node( 2);
        header.next.next.next = new Node( 4 );
        header.next.next.next.next = new Node( 5 );
        header.next.next.next.next.next = new Node( 6 );
        header.next.next.next.next.next.next = new Node( 7 );
        header.next.next.next.next.next.next.next = new Node( 8 );

        List<Node> ksizedList = breakListIntoKSizeList( header, 4 );
        System.out.println( ksizedList );
        reverseEachSplittedList( ksizedList );
        for(Node header1:ksizedList){
            print(header1);
        }
        joinReversedLinks(ksizedList);
        print( ksizedList.get( 0 ) );

    }
}


    class Node
    {
        int data;
        Node next;


        public Node( int data )
        {
            this.data = data;
        }
        @Override public String toString()
        {
            return "Node{" + "data=" + data + ", next=" + next + '}';
        }
    }

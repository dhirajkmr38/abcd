package com.practice.flatten;

import java.util.ArrayList;
import java.util.ArrayList;


public class FlattenLinkLiest
{
    static Node flatten( Node root )
    {
        ArrayList<Node> nodeArrayList = new ArrayList<>();
        while ( root != null ) {
            nodeArrayList.add( root );
            root = root.next;
        }

        Node headerPointer = nodeArrayList.get( 0 );
        Node currentPointer = headerPointer;
        while ( nodeArrayList.size() != 0 ) {
            Node nextGreater = nodeArrayList.get( 0 );
            int index = 0;
            for ( int i = 1; i < nodeArrayList.size(); i++ ) {
                if ( nextGreater.data > nodeArrayList.get( i ).data ) {
                    nextGreater = nodeArrayList.get( i );
                    index = i;
                }
            }
            currentPointer.next = nextGreater;
            currentPointer = currentPointer.next;
            nextGreater = nextGreater.bottom;
            if ( nextGreater == null ) {
                nodeArrayList.remove( index );
            } else {
                nodeArrayList.set( index, nextGreater );

            }

        }
        return headerPointer;
    }


    public static void main( String arg[] )
    {
        Node root = new Node( 5 );

        root.next = new Node( 10 );
        root.next.next = new Node( 19 );
        root.next.next.next = new Node( 28 );

        root.bottom = new Node( 7 );
        root.bottom.bottom = new Node( 8 );
        root.bottom.bottom.bottom = new Node( 30 );


        root.next.bottom = new Node( 20 );

        root.next.next.bottom = new Node( 22 );
        root.next.next.bottom.bottom = new Node( 50 );

        root.next.next.next.bottom= new Node( 35 );
        root.next.next.next.bottom.bottom= new Node(40);
        root.next.next.next.bottom.bottom.bottom= new Node(45);


        //   root.next.next.bottom= new Node(17);
        Node headerPointer = flatten( root );

        while ( headerPointer != null ) {
            System.out.println( headerPointer.data );
            headerPointer = headerPointer.next;
        }

    }
}

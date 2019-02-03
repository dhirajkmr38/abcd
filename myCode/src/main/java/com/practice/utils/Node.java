package com.practice.utils;

public class Node
{
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }


    @Override public boolean equals( Object o )
    {
        if ( this == o )
            return true;
        if ( o == null || getClass() != o.getClass() )
            return false;

        Node node = (Node) o;

        if ( data != node.data )
            return false;
        return next != null ? next.equals( node.next ) : node.next == null;
    }


    @Override public int hashCode()
    {
        int result = data;
        result = 31 * result + ( next != null ? next.hashCode() : 0 );
        return result;
    }
}


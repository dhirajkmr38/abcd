package com.practice.rotttenorange;

public class StackNode
{
    int data;
    boolean markForDelete;


    public StackNode( int data, boolean markForDelete )
    {
        this.data = data;
        this.markForDelete = markForDelete;
    }


    @Override public boolean equals( Object o )
    {
        if ( this == o )
            return true;
        if ( o == null || getClass() != o.getClass() )
            return false;

        StackNode stackNode = (StackNode) o;

        return data == stackNode.data;
    }


    @Override public int hashCode()
    {
        return data;
    }


    @Override public String toString()
    {
        return "StackNode{" + "data=" + data + ", markForDelete=" + markForDelete + '}';
    }
}

package com.practice.pojo;


public class Node
{
    public Node left;
    public Node right;
    public int data;


    public Node()
    {
    }


    public Node( int data )
    {
        this.data = data;
        left = null;
        right = null;
    }


    @Override public String toString()
    {
        return "Node{" + "data=" + data + '}';
    }
}
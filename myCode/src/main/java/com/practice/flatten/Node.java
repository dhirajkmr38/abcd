package com.practice.flatten;

public class Node
{
    int data;
    Node next;
    Node bottom;

    Node(int d)
    {
        data = d;
        next = null;
        bottom = null;
    }


    @Override public String toString()
    {
        return "Node{" + "data=" + data + ", next=" + next + ", bottom=" + bottom + '}';
    }
}

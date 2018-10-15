package com.practice.pojo;

public class TreeNode
{
    public int key;
    public TreeNode left, right;


    public TreeNode( int key )
    {
        this.key = key;
        left = right = null;
    }


    @Override public String toString()
    {
        return "key=" + key;
    }
}
package com.practice.pojo;

public class WrapperTreeNode
{
    public TreeNode treeNode;
    public int width;
    public WrapperTreeNode left;
    public WrapperTreeNode right;


    @Override public String toString()
    {
        return "treeNode=" + treeNode + ", " + width + '}';
    }
}

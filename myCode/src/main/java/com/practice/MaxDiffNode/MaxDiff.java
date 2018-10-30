package com.practice.MaxDiffNode;

import com.practice.pojo.Node;
import com.practice.utils.Tree1;


public class MaxDiff
{
    static int maxDiffNum = 0;


    public static void main( String at[] )
    {
        Node root = new Tree1().getRoot();
        new MaxDiff().maxDiff( root );
        System.out.println( maxDiffNum );

    }


    int getMin( int a, int b )
    {
        if ( a < b )
            return a;
        else
            return b;

    }


    int maxDiff( Node root )
    {
        if ( root == null )
            return Integer.MAX_VALUE;
        else if ( root.left == null && root.right == null ) {
            return root.data;
        }
        int leftMin = maxDiff( root.left );
        int rightMin = maxDiff( root.right );
        int min = getMin( leftMin, rightMin );
        if ( root.data < min )
            return root.data;
        else {
            int curDiff = root.data - min;
            if ( curDiff > maxDiffNum ) {
                maxDiffNum = curDiff;
            }
            return min;
        }
    }
}

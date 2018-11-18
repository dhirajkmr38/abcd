package com.practice.pojo;

import com.practice.utils.Tree1;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Stack;


public class EdgeViewTree
{
    static int leftLevelMarker[] = new int[100];
    static int rightLevelMarker[] = new int[100];
    static Set<Integer> resultSet = new LinkedHashSet<Integer>();
    static Stack<Integer> stack = new Stack<Integer>();


    public static void recurLeft( Node node, int currentHeight )
    {
        if ( node == null || leftLevelMarker[currentHeight] == 1 )
            return;
        else {
            resultSet.add( node.data );
            leftLevelMarker[currentHeight] = 1;
            recurLeft( node.left, currentHeight + 1 );
            recurLeft( node.right, currentHeight + 1 );
        }
    }


    public static void recurRight( Node node, int currentHeight )
    {

        if ( node == null || rightLevelMarker[currentHeight] == 1 )
            return;
        else {
            stack.push( node.data );
            rightLevelMarker[currentHeight] = 1;
            recurRight( node.right, currentHeight + 1 );
            recurRight( node.left, currentHeight + 1 );
        }

    }


    public static void leafNode( Node node )
    {
        if ( node == null ) {
            return;
        } else if ( node.left == null && node.right == null ) {
            resultSet.add( node.data );
        } else {
            leafNode( node.left );
            leafNode( node.right );
        }
    }


    public static void main( String a[] )
    {
        Node root = new Tree1().getRoot();
        resultSet.add( root.data );
        recurLeft( root.left, 1 );
        leafNode( root );
        recurRight( root.right, 1 );
        while ( stack.isEmpty() == false ) {
            int item = stack.pop();
            resultSet.add( item );
        }
        for ( Integer a1 : resultSet ) {
            System.out.print( a1 + " " );
        }
        System.out.println( resultSet );
    }
}

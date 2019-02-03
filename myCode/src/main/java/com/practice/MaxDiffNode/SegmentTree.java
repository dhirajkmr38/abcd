package com.practice.MaxDiffNode;

import com.practice.pojo.Node;


public class SegmentTree
{
    static int index = 0;


    public static void main( String arg[] )
    {
        int input[] = { 1, 2, 3,4,5,6,7,8,9};
        int height = (int) Math.ceil( Math.log( input.length ) / Math.log( 2 ) );
        System.out.println( height );
        Node root = new Node();
        root.left = constructTree( input, ( (input.length-1) / 2 ) , height, 1 );
        root.right = constructTree( input, input.length - 1, height, 1 );
        if ( root.left != null ) {
            root.data = root.left.data;
        }
        if ( root.right != null ) {
            root.data += root.right.data;
        }
        Inorder( root );

    }


    static void Inorder( Node root )
    {
        if ( root == null )
            return;
        else {

            Inorder( root.left );
            System.out.print( root.data + " " );
            Inorder( root.right );
        }
    }


    static Node constructTree( int input[], int limit, int totalHeight, int currentHeight )
    {
        if ( input.length == 0 || currentHeight == totalHeight || index > limit ) {
            return null;
        } else if ( currentHeight == totalHeight - 1 ||  limit-index<2 ) {
            if ( limit != index ) {
                Node segment = new Node();
                segment.left = new Node( input[index] );
                ++index;
                segment.right = new Node( input[index] );
                ++index;
                segment.data = segment.left.data;
                segment.data += segment.right.data;
                return segment;

            } else {
                Node segment = new Node( input[index] );
                ++index;
                return segment;
            }

        } else {
            Node segment = new Node();
            segment.left = constructTree( input, limit, totalHeight, currentHeight + 1 );
            segment.right = constructTree( input, limit, totalHeight, currentHeight + 1 );
            if ( segment.left != null ) {
                segment.data = segment.left.data;
            }
            if ( segment.right != null ) {
                segment.data += segment.right.data;
            }

            return segment;
        }

    }


}

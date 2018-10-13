package com.practice.rotttenorange;

import java.util.LinkedList;
import java.util.Queue;


public class RottenOrange
{
    static Node getRottenNode( Node currentNode, int matrix[][], Direction direction )
    {
        if ( currentNode == null || matrix == null ) {
            return null;
        } else {
            //LookLeft
            if ( direction.getDirection().equals( "LEFT" ) ) {
                if ( currentNode.j > 0 && matrix[currentNode.i][currentNode.j - 1] == 1 ) {
                    matrix[currentNode.i][currentNode.j - 1] = 2;
                    return new Node( currentNode.i, currentNode.j - 1 );
                } else {
                    return null;
                }
            }
            //LookRight
            else if ( direction.getDirection().equals( "RIGHT" ) ) {
                if ( currentNode.j < matrix.length - 1 && matrix[currentNode.i][currentNode.j + 1] == 1 ) {
                    matrix[currentNode.i][currentNode.j + 1] = 2;
                    return new Node( currentNode.i, currentNode.j + 1 );
                } else {
                    return null;
                }
            }
            //up
            else if ( direction.getDirection().equals( "UP" ) ) {
                if ( currentNode.i > 0 && matrix[currentNode.i - 1][currentNode.j] == 1 ) {
                    matrix[currentNode.i - 1][currentNode.j] = 2;
                    return new Node( currentNode.i - 1, currentNode.j );
                } else {
                    return null;
                }
            }
            //DOWN
            else if ( direction.getDirection().equals( "DOWN" ) ) {
                if ( currentNode.i < matrix.length - 1 && matrix[currentNode.i + 1][currentNode.j] == 1 ) {
                    matrix[currentNode.i + 1][currentNode.j] = 2;
                    return new Node( currentNode.i + 1, currentNode.j );
                } else {
                    return null;
                }
            } else {
                System.out.println( "Invalid direction" );
            }
        }
        return null;
    }


    public static int calculateTimer( int matrix[][] )
    {
        print( matrix );
        Queue<Node> processingQueue = new LinkedList<Node>();
        Queue<Node> dataHoldingQueue = new LinkedList<Node>();


        for ( int i = 0; i < matrix.length; i++ ) {
            for ( int j = 0; j < matrix.length; j++ ) {
                if ( matrix[i][j] == 2 ) {
                    Node node = new Node( i, j );
                    processingQueue.add( node );
                }
            }
        }
        int timer;
        for ( timer = 0; processingQueue.size() != 0 || dataHoldingQueue.size() != 0; timer++ ) {
            while ( processingQueue.size() != 0 ) {
                Node currrentNode = processingQueue.remove();
                Node leftNode = getRottenNode( currrentNode, matrix, Direction.LEFT );
                Node rightNode = getRottenNode( currrentNode, matrix, Direction.RIGHT );
                Node upNode = getRottenNode( currrentNode, matrix, Direction.UP );
                Node downNode = getRottenNode( currrentNode, matrix, Direction.DOWN );
                if ( leftNode != null ) {
                    dataHoldingQueue.add( leftNode );
                }
                if ( rightNode != null ) {
                    dataHoldingQueue.add( rightNode );
                }
                if ( upNode != null ) {
                    dataHoldingQueue.add( upNode );
                }
                if ( downNode != null ) {
                    dataHoldingQueue.add( downNode );
                }
            }
            Queue temp = processingQueue;
            processingQueue = dataHoldingQueue;
            dataHoldingQueue = temp;
            print( matrix );
        }

        return timer;

    }


    static void print( int matrix[][] )
    {
        System.out.println( "\n" );
        for ( int i = 0; i < matrix.length; i++ ) {
            for ( int j = 0; j < matrix.length; j++ ) {
                System.out.print( matrix[i][j] );
            }
            System.out.println();
        }
    }


    public static void main( String args[] )
    {
        int matrix[][] = { { 1, 0, 1 }, { 0, 1, 0 }, { 1, 1, 2 } };
        Queue<Node> queue = new LinkedList<Node>();

        int time = calculateTimer( matrix );
        System.out.println( "Timer is " + ( time - 1 ) );


    }
}
